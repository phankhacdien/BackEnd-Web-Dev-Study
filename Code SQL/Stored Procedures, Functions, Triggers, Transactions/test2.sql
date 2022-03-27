-- create audit table
create table employees_audit (
id int auto_increment primary key,
employeeNumber int not null,
firstname varchar(50) not null,
lastname varchar(50) not null,
changedate datetime default null,	
action varchar(50) default null
);

-- create before update trigger
create trigger before_update_employee
	before update on employees
	for each row
	insert into employees_audit
    set action = 'update',
    employeeNumber = OLD.employeeNumber,
    firstname = OLD.firstname,
    lastname = OLD.lastname,
    changedate = NOW();

-- update trigger


