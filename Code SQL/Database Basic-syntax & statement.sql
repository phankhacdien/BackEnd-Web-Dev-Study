-- Create Schema
create database demo;

-- Create Table
create table demo.Student(
	std_id int not null auto_increment,
	std_name varchar(200),
    std_doB date,
    std_sex varchar(20),
    std_phone int(20),
    university varchar(500),
    graduateLevel varchar(100),
    std_gpa float(3,2),
    std_entryscore float(4,2),
    constraint std_PK primary key (std_id, std_name)
);

create table demo.Student2(
	std_id int not null auto_increment,
	std_name varchar(200),
    std_doB date,
    std_sex varchar(20),
    std_phone int(20),
    university varchar(500),
    graduateLevel varchar(100),
    std_gpa float(3,2),
    std_entryscore float(4,2),
    constraint std_PK primary key (std_id, std_name)
);

-- insert into 
insert into demo.Student (std_name, std_doB, std_sex, std_phone, university, graduateLevel, std_gpa, std_entryscore)values
('Dien', '1998-10-11', 'male', 0439128698, 'HUST', 'Good', 3.2, 9.0),
('Dung', '1999-4-6', 'male', 0987654321, 'HUST', 'Good', 3.1, 7.0),
('Tuan', '1995-3-17', 'male', 0439345398, 'HUST', 'Normal', 2.9, 10.0),
('Linh', '1997-1-21', 'male', 0423423798, 'HUST', 'Normal', 2.7, 8.0),
('Hung', '1998-7-30', 'male', 0439456398, 'HUST', 'Good', 3.0, 7.0);

insert into demo.Student (std_name, std_doB, std_sex, std_phone, university, graduateLevel, std_gpa, std_entryscore)values
('Giang', '1998-9-1', 'female', 0439128698, 'HUST', 'Good', 3.2, 9.0);

-- Update
update demo.student
set std_name = 'Hai'
where std_id = 2;

-- Delete
delete from demo.student where std_id = 5;

-- Select
select * from demo.student;
select * from demo.student2;
-- select * 
-- into student2 
-- from student
-- where student.graduateLevel = 'normal';

insert into student2
select * from student
where student.graduateLevel = 'normal';

-- using alias
select std_name as student_name from demo.student;
select university from demo.student as student_table;

-- Group by
select std_sex
from demo.student
group by std_sex;

select std_sex, graduateLevel
from demo.student
group by std_sex, graduateLevel;

select count(std_id), graduatelevel
from demo.student
group by graduatelevel;

select count(std_id), graduateLevel
from demo.student
where std_sex = 'male'
group by graduatelevel;

-- Having
select count(std_id), graduateLevel
from demo.student
group by graduateLevel
having count(std_id) > 2;

-- Order by
select std_name, std_gpa
from demo.student
order by std_gpa DESC;

-- Cast()
select cast(150 as char);
select cast("14:06:10" as time);
select cast(5-10 as Signed);



-- Explain
explain select * from demo.student;




