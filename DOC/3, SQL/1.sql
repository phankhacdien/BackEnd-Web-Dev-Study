create database learningdb;

create table learningdb.Student(
	name varchar(200),
    dob date,
    sex varchar(10),
    phone tinyint(12),
    university varchar(200),
    graduateLevel varchar(20)
);

alter table Student
drop column dob;

alter table Student
add column birthday date;

alter table Student
modify column birthdat datetime;