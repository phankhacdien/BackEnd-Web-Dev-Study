create database learningdb;

create table learningdb.Student(
	name varchar(200) not null,
    dob date,
    sex varchar(10),
    phone tinyint(12) not null,
    university varchar(200),
    graduateLevel varchar(20),
    unique (name),
    constraint person unique (name,phone),
    primary key (name),
    constraint student primary key(name,phone)
);

alter table Student
add primary key (name);

alter table Student
add constraint PK_student primary key (name,phone);

alter table Student
drop column dob;

alter table Student
add column birthday date;

alter table Student
modify column birthdat datetime;