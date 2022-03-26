-- This example maybe using database from mysampledatabase.sql

create database test_Subquery;

create table t1 (
	s1 int,
    s2 char(5) not null
    );
    
insert into t1 values
(100, 'abcde');

select s2 from t1;

-- 1. Subquery in where clause
create table customers(
	customerID int not null primary key auto_increment,
    name varchar(255),
    customerNum int,
    paymentPurpose varchar(255),
    Amount int
    );

insert into customers (name, customerNum, paymentPurpose, Amount) values
('Nikhil', '21', 'Rent', '4000'),
('kali', '19', 'Rent', '3000'),
('yasuo', '20', 'Rent', '5000');

select name, customerNum, paymentPurpose from customers
where amount > (select avg(Amount) from Customers);

-- 2. Subquery with operators IN and NOT IN
create table orders(
	ordersID int not null primary key auto_increment,
    customerNum int,
    status varchar(255),
    orderNum int,
    budget int
    );
    
insert into orders (customerNum, status, orderNum, budget) values
('21', 'Success', 211, 5000),
('18', 'OK', 199, 8000),
('20', 'FAIL', 200, 10000);

select name, customerNum from customers 
where customerNum in (
	select customerNum from orders);
    
-- 3. With from clause
select I.customerID, I.name, I.paymentPurpose, I.Amount 
from 
(select avg(orders.budget) as avgBudget from orders) as budget,
customers as I
where I.Amount > budget.avgBudget; 

-- 4. Correlated subquery
/*
- A correlated subquery is independent query. It means that you can use it as a standalone query.
- It uses the result set data of outer query and evaluated for each row.
*/
select orders.orderNum, count(orders.orderNum) as items from orders group by orderNum;

-- 5. SubQuery with EXISTS and NOT EXISTS
-- Using the EXISTS and NOT EXISTS operators in SQL subquery, the Boolean value is returned as result either TRUE or FALSE
select customerNum from customers as cusNum 
where exists
(
	select * from orders where
    orders.customerNum = cusNum.customerNum
);










