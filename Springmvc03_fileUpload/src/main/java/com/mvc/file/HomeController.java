package com.mvc.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.mvc.file.model.FileValidator;
import com.mvc.file.model.UploadFile;

@Controller
public class HomeController {
	
	@Autowired
	private FileValidator fileValidator;
	
	@RequestMapping("/form")
	public String getUploadForm() {
		return "uploadForm";
	}
	
	@RequestMapping("/upload")
	public String fileUpload(HttpServletRequest request, Model model, 
							 UploadFile uploadFile, BindingResult result) {
		//BindingResult : 유효성 검사 후 에러메시지를 담아 전달.
		
		
		//유효성 검사 : 파일 크기가 0인지
		fileValidator.validate(uploadFile, result);
		if(result.hasErrors()) {
			return "uploadForm";
		}
		
		MultipartFile file = uploadFile.getFile();
		String filename = file.getOriginalFilename();	//업로드 되어 controller로 넘어온 filedml 실제 이름
		//System.out.println(filename);
		
		UploadFile fileobj = new UploadFile();
		fileobj.setFilename(filename);
		fileobj.setDesc(uploadFile.getDesc());
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = file.getInputStream();
			
			String path = "C:\\upload";
			File storage = new File(path);
			if(!storage.exists()) {	//존재여부 확인
				storage.mkdirs();	//없으면 디렉토리 만들기(폴더생성)
			}
			
			File newfile = new File(path+"/"+filename);
			if(!newfile.exists()) {
				newfile.createNewFile();
			}
			
			System.out.println(newfile.getPath());
			outputStream = new FileOutputStream(newfile);
			
			int read = 0;
			byte[] b = new byte[(int)file.getSize()];
			while( (read=inputStream.read(b)) != -1 ) {
				outputStream.write(b,0,read);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("fileobj",fileobj);
		
		return "uploadRes";
		
	}
	
}
