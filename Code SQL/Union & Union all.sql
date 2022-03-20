create database test_union;

create table Student(
	stud_id int not null auto_increment,
    name varchar(200),
    email varchar(200),
    city varchar(200),
    primary key (stud_id)
);

create table Student2(
	stud_id int not null auto_increment,
    name varchar(200),
    email varchar(200),
    city varchar(200),
	primary key (stud_id)
);

insert into Student(name, email, city) values
('Peter', 'peter@gmail.com', 'Texas'),
('Suzi', 'suzi@gamil.com', 'California'),
('Joseph', 'joseph@gmail.com', 'Alaska'),
('Andrew', 'andrew@gamil.com', 'Los Angeles'),
('Brayan', 'brayan@gmail.com', 'New York');

insert into Student2(name, email, city) values
('Stephen', 'stephen@gmail.com', 'Texas'),
('Joseph', 'suzi@gamil.com', 'Los Angeles'),
('Peter', 'joseph@gmail.com', 'California'),
('David', 'david@gamil.com', 'New York'),
('Maddy', 'maddy@gmail.com', 'Los Angeles');

select name from student
Union all
select name from Student2;

select * from student;
