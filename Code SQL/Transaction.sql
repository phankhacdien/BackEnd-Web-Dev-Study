-- This example using database from mysampledatabase.sql

-- Transaction
-- 1. Disable chế độ auto commit
set autocommit = 0;

-- 2. Start Transaction
start transaction;

-- 3. DML 
delete from classicmodels.orders where orderNumber = 10426;

truncate demo.student;

savepoint sp1;
insert into orders(orderNumber, orderDate, requiredDate, status, customerNumber) values 
(10426,	'2005-05-31', '2005-06-07', 'In Process', 119);

-- 4. Commit
commit;

-- 5. Or roll back if nessarcery
rollback;

select * from orders;
























