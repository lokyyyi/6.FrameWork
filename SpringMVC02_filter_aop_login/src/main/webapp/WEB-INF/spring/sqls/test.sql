DROP TABLE MYBOARD;

CREATE TABLE MYBOARD(
	MYNO INT AUTO_INCREMENT PRIMARY KEY,
	MYNAME VARCHAR(500) NOT NULL,
	MYTITLE VARCHAR(1000) NOT NULL,
	MYCONTENT VARCHAR(4000) NOT NULL,
	MYDATE DATE NOT NULL	
);

INSERT INTO MYBOARD VALUES(NULL, '관리자', '스프링 테스트', 'SPRING MVC 재밌다...', NOW());

SELECT * FROM MYBOARD ORDER BY MYNO DESC;

--------------------
DROP TABLE MYMEMBER;

SELECT * FROM MYMEMBER;

CREATE TABLE MYMEMBER(
	MEMBERNO INT AUTO_INCREMENT PRIMARY KEY,
	MEMBERID VARCHAR(1000) NOT NULL,
	MEMBERPW VARCHAR(1000) NOT NULL,
	MEMBERNAME VARCHAR(1000) NOT NULL
);

INSERT INTO MYMEMBER VALUES(NULL, 'admin', '1234', '관리자');