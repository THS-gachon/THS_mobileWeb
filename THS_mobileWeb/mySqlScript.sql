
/*
 	bottom
 */
/*CREATE DATABASE gachon_swdm_ths_web;
USE gachon_swdm_this_web;
*/




CREATE TABLE building(
	building varchar(20),
	latitude double,
	longitude double,
	PRIMARY KEY (building)
 );

INSERT INTO building(building,latitude,longitude) VALUES("새롬관",37.450904,127.127354);
INSERT INTO building(building,latitude,longitude) VALUES("웅지관",37.449494, 127.129401);



CREATE TABLE department(
 	dept_name varchar(40),
 	building varchar(20),
 	PRIMARY KEY (dept_name),
 	FOREIGN KEY (building) references building(building)
 );

INSERT INTO department(dept_name,building) VALUES("소프트웨어 설계 경영학과","새롬관");
INSERT INTO department(dept_name,building) VALUES("경영학과","웅지관");
	 

CREATE TABLE class_room(
	building varchar(20),
	room_number varchar(8),
	capacity integer,
	PRIMARY KEY (building, room_number),
	FOREIGN KEY (building) REFERENCES building(building)
);

INSERT INTO class_room(building, room_number, capacity) VALUES('새롬관', '413', 40);
INSERT INTO class_room(building, room_number, capacity) VALUES('새롬관', '304', 40);





 CREATE TABLE time_slot(
	 	day tinyInt,
	 	time_slot varchar(2),
	 	start_time Integer,
	 	duration tinyInt,
	 	PRIMARY KEY (day, time_slot)
);

 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '1', 0900, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '2', 1000, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '3', 1100, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '4', 1200, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '5', 1300, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '6', 1400, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '7', 1500, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '8', 1600, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '9', 1700, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '10', 1800, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '11', 1850, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '12', 1940, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '13', 2030, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '14', 2120, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, '15', 2210, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'A', 0900, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'B', 1030, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'C', 1200, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'D', 1330, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'E', 1500, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(1, 'F', 1630, 75);
 

 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '1', 0900, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '2', 1000, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '3', 1100, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '4', 1200, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '5', 1300, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '6', 1400, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '7', 1500, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '8', 1600, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '9', 1700, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '10', 1800, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '11', 1850, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '12', 1940, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '13', 2030, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '14', 2120, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, '15', 2210, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'A', 0900, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'B', 1030, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'C', 1200, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'D', 1330, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'E', 1500, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(2, 'F', 1630, 75);

 
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '1', 0900, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '2', 1000, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '3', 1100, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '4', 1200, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '5', 1300, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '6', 1400, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '7', 1500, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '8', 1600, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '9', 1700, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '10', 1800, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '11', 1850, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '12', 1940, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '13', 2030, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '14', 2120, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, '15', 2210, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'A', 0900, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'B', 1030, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'C', 1200, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'D', 1330, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'E', 1500, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(3, 'F', 1630, 75);
 
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '1', 0900, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '2', 1000, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '3', 1100, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '4', 1200, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '5', 1300, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '6', 1400, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '7', 1500, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '8', 1600, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '9', 1700, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '10', 1800, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '11', 1850, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '12', 1940, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '13', 2030, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '14', 2120, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, '15', 2210, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'A', 0900, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'B', 1030, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'C', 1200, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'D', 1330, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'E', 1500, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(4, 'F', 1630, 75);
 
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '1', 0900, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '2', 1000, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '3', 1100, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '4', 1200, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '5', 1300, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '6', 1400, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '7', 1500, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '8', 1600, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '9', 1700, 50);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '10', 1800, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '11', 1850, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '12', 1940, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '13', 2030, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '14', 2120, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, '15', 2210, 45);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'A', 0900, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'B', 1030, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'C', 1200, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'D', 1330, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'E', 1500, 75);
 INSERT INTO time_slot(day, time_slot, start_time, duration) values(5, 'F', 1630, 75);


 

CREATE TABLE course(
 	id_course integer,
 	year integer,
 	semester tinyInt,
 	title varchar(60),
 	dept_name varchar(40),
 	building varchar(20),
 	room_number varchar(8),
 	credits tinyInt,
 	time_slot varchar(16),
 	currentNum integer,
 	maxNum integer,
 	num_weeks tinyInt,
 	times tinyInt,
 	
 	PRIMARY KEY (year,semester,id_course),
 	FOREIGN KEY (dept_name) REFERENCES department(dept_name),
 	FOREIGN KEY (building, room_number) REFERENCES class_room (building, room_number),
 	INDEX index1(year, semester, dept_name, id_course)
 );


INSERT INTO course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum,num_weeks,times) VALUES(2014 , 1, 10622001, '기술경영', '소프트웨어 설계 경영학과', '새롬관', '304', 3, '1B,2B', 0, 4,15,2);
INSERT INTO course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum,num_weeks,times) VALUES(2014 , 1, 06480001, '데이터마이닝', '소프트웨어 설계 경영학과', '새롬관', '413', 3, '2E,4D', 0, 4,15,2);
INSERT INTO course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum,num_weeks,times) VALUES(2014 , 1, 09031001, '멀티미디어및실습', '소프트웨어 설계 경영학과', '새롬관', '413', 3, '35,36,37,38', 0, 4,15,1);
INSERT INTO course (year, semester, id_course,title,dept_name,building,room_number, credits, time_slot,currentNum,maxNum,num_weeks,times) VALUES(2014 , 1, 11438001, '졸업작품3', '소프트웨어 설계 경영학과', '새롬관', '304', 3, '39,310', 0, 4,15,1);

 

CREATE TABLE class_room_server
 (
 	year integer,
 	semester tinyInt,
 	id_course integer,
 	isOnline boolean,
 	time_recentOnline long,
 	ip varchar(40),
 	PRIMARY KEY (year, semester, id_course),
 	FOREIGN KEY (year, semester, id_course) references course (year, semester, id_course),
 	INDEX index1 (year,semester,id_course)
 );


INSERT INTO class_room_server(year, semester, id_course, isOnline) values (2014, 1,10622001, false);
INSERT INTO class_room_server(year, semester, id_course, isOnline) values (2014, 1, 06480001, false); 
INSERT INTO class_room_server(year, semester, id_course, isOnline) values (2014, 1, 09031001, false); 
INSERT INTO class_room_server(year, semester, id_course, isOnline) values (2014, 1, 11438001, false); 

 



CREATE TABLE user(
	 id_login varchar(40),
	 id_person integer,
	 pw varchar(50),
	 name varchar(30),
	 phone_number varchar(20),
	 position tinyInt,
	 dept_name varchar(40),
	 PRIMARY KEY (id_login),
	 FOREIGN KEY (dept_name) REFERENCES department(dept_name),
	 INDEX index1 (id_person)
 );
	 
INSERT INTO user(id_login,id_person,pw,name,phone_number,position,dept_name) VALUES ("hyrjo",199810003, "123", "조형래","031-750-5180","1","경영학과");
INSERT INTO user(id_login,id_person,pw,name,phone_number,position,dept_name) VALUES ("cykim",201010002, "123", "김철연","031-750-8658","1","소프트웨어 설계 경영학과");
INSERT INTO user(id_login,id_person,pw,name,phone_number,position,dept_name) VALUES ("wjhan",201110001, "123", "한우진"," 031-750-8668","1","소프트웨어 설계 경영학과");
INSERT INTO user(id_login,id_person,pw,name,phone_number,position,dept_name) VALUES ("master",201100000,"123", "THS","010","3","소프트웨어 설계 경영학과");




CREATE TABLE teaches(
 	id_professor varchar(40),
 	year integer,
 	semester tinyInt,
 	id_course integer,
	summary text,
 	PRIMARY KEY (id_professor, year, semester, id_course),
 	FOREIGN KEY (id_professor) REFERENCES user(id_login),
 	FOREIGN KEY (year, semester, id_course) REFERENCES course(year, semester, id_course),
 	INDEX index1 (year, semester, id_course),
 	INDEX index2 (id_professor, year, semester)
);

INSERT INTO teaches(id_professor, year, semester, id_course,summary) VALUES('hyrjo',2014,1,10622001,'null');
INSERT INTO teaches(id_professor, year, semester, id_course,summary) VALUES('cykim',2014,1,06480001,'null');
INSERT INTO teaches(id_professor, year, semester, id_course,summary) VALUES('wjhan',2014,1,09031001,'null');
INSERT INTO teaches(id_professor, year, semester, id_course,summary) VALUES('cykim',2014,1,11438001,'null');




CREATE TABLE takes(
 	id_student varchar(40),
 	year integer,
 	semester tinyInt,
 	id_course integer,
 	grade float,
 	PRIMARY KEY (id_student, year, semester, id_course),
 	FOREIGN KEY (id_student)  REFERENCES user(id_login),
 	FOREIGN KEY (year, semester, id_course) REFERENCES course(year,semester,id_course),
 	INDEX index1 (year, semester, id_course),
 	INDEX index2 (id_student, year, semester)
);


CREATE TABLE school_board(
	type tinyInt,
	id_user varchar(40),
 	date_written BIGINT unsigned,
 	title varchar(200),
 	contents text,
 	ip varchar(40),
 	readNum integer,
 	PRIMARY KEY (type, date_written, id_user),
 	FOREIGN KEY (id_user) REFERENCES user(id_login),
 	INDEX index1 (type, date_written, id_user)
);





CREATE TABLE school_board_reply(
	id_user varchar(40),
	date_written bigInt unsigned,
	ip varchar(40),
	contents text,
		
	board_date bigInt unsigned,
	board_writer varchar(40),
	board_type tinyInt,
		
	PRIMARY KEY (board_type, board_date, board_writer, date_written, id_user),
	FOREIGN KEY (board_type, board_date, board_writer) REFERENCES school_board(type, date_written, id_user),
	FOREIGN KEY (id_user) REFERENCES user (id_login),
	INDEX index1 (board_type, board_date, board_writer, date_written)
);






 CREATE TABLE class_board(
 	id_user varchar(40),
 	date_written bigInt unsigned,
 	title varchar(200),
 	contents text,
 	ip varchar(40),
 
 	year integer,
 	semester tinyInt,
 	id_course integer,
 	type tinyInt,
 	readNum integer,
 		
 	PRIMARY KEY (year, semester, id_course, type, date_written, id_user),
 	FOREIGN KEY (year, semester, id_course) REFERENCES course(year, semester, id_course),
 	FOREIGN KEY (id_user) REFERENCES user(id_login),
 	INDEX index1(year, semester, id_course, type, date_written)			 	
);



CREATE TABLE class_board_reply(
	id_user varchar(40),
	date_written bigInt unsigned,
	ip varchar(40),
	contents text,
	 	
	year integer,
	semester tinyInt,
	id_course integer,
	board_type tinyInt,
	board_date bigInt unsigned,
	board_writer varchar(40),
	 	
	PRIMARY KEY (year, semester, id_course, board_type, board_date, board_writer, date_written, id_user),
	FOREIGN KEY (year,semester,id_course, board_type, board_date, board_writer) REFERENCES class_board (year, semester, id_course, type, date_written, id_user),
	INDEX index1(year, semester, id_course, board_type, board_date, board_writer, date_written)
 );




create table attendance(
	year integer,
	semester tinyInt,
	id_course integer,
	week tinyInt,
	day tinyInt,
	time bigInt unsigned,
	id_student varchar(40),
	state tinyInt,
	primary key(year,semester,id_course, week, day, id_student),
	foreign key(year, semester, id_course) references course (year,semester,id_course),
	foreign key(id_student) references user (id_login),
	INDEX index1(year,semester,id_course,week,day)	
);

create table question(
	year integer,
	semester tinyInt,
	id_course integer,
	week tinyInt,
	day tinyInt,
	time bigInt unsigned,
	id_student varchar(40),
	question text,
	primary key(year,semester,id_course,week,day,time,id_student),
	foreign key(year, semester, id_course) references course (year,semester,id_course),
	foreign key(id_student) references user (id_login),
	INDEX index1(year,semester,id_course,week,day)
);





