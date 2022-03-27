-- create new transaction

start transaction;

-- get the latest order number
select @orderNumber := max(orderNumber) + 1
from orders;

-- insert new order for customer
insert into orders (orderNumber, orderDate, requiredDate, shippedDate, status, customerNumber)
values (@orderNumber, '2005-05-31', '2005-06-10', '2005-06-11', 'In process', 145);

-- insert order line items
insert into orderdetails(orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber)
values 
(@orderNumber, 'S18_1749', 30, '136', 1),
(@orderNumber, 'S18_2248', 50, '55.09', 2);

-- commit changes
COMMIT;

select orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber, orderLineNumber, productCode, quantityOrdered, priceEach
from orders o
inner join orderdetails od using (orderNumber)
where o.orderNumber = 10426;

select * from orderdetails
where orderNumber = 10426;


-- rollback
create table test(
	id int,
	name nvarchar(25)
);

insert into test values 
(1, 'Hoang'),
(2, 'Le'),
(3, 'Phuc');

select * from test;

-- rollback
use classicmodels;
start transaction;