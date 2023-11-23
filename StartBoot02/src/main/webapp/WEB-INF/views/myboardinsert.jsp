<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/myboard/insert" method="post">
	<table>
		<tr>
			<th>NAME</th>
			<td><input type="text" name="myname"></td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td><input type="text" name="mytitle"></td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows="10" cols="40" name="mycontent"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="submit" value="작성">
				<input type="button" value="목록" onclick="">
			</td>
		</tr>
	</table>
</form>
</body>
</html>