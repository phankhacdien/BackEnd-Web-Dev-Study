create database built_in_test;

create table employee(
	name varchar(45) not null,
    occupation varchar(45) not null,
    working_date date,
    working_hours varchar(10)
);

create table another_employee(
	emp_id int,
    emp_fname varchar(45),
    emp_lname varchar(45),
    dept_id int,
    designation varchar(100)
);

insert into employee values
('Robin', 'Scientist', '2020-10-04', 12),  
('Warner', 'Engineer', '2020-10-04', 10),  
('Peter', 'Actor', '2020-10-04', 13),  
('Marco', 'Doctor', '2020-10-04', 14),  
('Brayden', 'Teacher', '2020-10-04', 12),  
('Antonio', 'Business', '2020-10-04', 11);

insert into another_employee values
(1, 'David', 'Miller', 2, 'Engineer'),
(2, 'Peter', 'Watson', 3, 'Manager'),
(3, 'Mark', 'Boucher', 1, 'Scientist'),
(2, 'Peter', 'Watson', 3, 'BDE'),
(1, 'David', 'Miller', 2, 'Developer'),
(4, 'Adam', 'Warner', 4, 'Receptionist'),
(3, 'Mark', 'Boucher', 1, 'Engineer'),
(4, 'Adam', 'Warner', 4, 'Clerk');

-- Select
select * from employee;
select * from another_employee;

-- Count()
select count(name) from employee;

-- Sum()
select sum(working_hours) as "Total working hours" from employee;

-- Avg()
select avg(working_hours) as "Average working hours" from employee;

-- Min(), Max()
select min(working_hours) as "Minimum working hours" from employee;
select max(working_hours) as "Minimum working hours" from employee;

-- First()
select occupation from employee limit 1;

-- Last()
select occupation from employee order by name desc limit 1;

-- Group_concat()
select emp_id, emp_fname, emp_lname, dept_id,
group_concat(designation) from another_employee group by emp_id;