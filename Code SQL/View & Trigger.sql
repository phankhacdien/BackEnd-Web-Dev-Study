-- This example using database from mysampledatabase.sql

-- View example
create view shippedOrders as
select 
	customers.customerNumber,
	customers.customerName,
	customers.phone,
	orders.shippedDate,
	orders.status
from customers 
left join orders on customers.customerNumber = orders.customerNumber where status = 'shipped' order by customerNumber;

-- Trigger
create table ordersWatch(
	new_orderNumber int,
    orderDate varchar(255),
    status varchar(255),
    customerNumber int
);

create trigger ordersWatch before insert on orders for each row 
    insert into ordersWatch
    set new_orderNumber = new.orderNumber,
    orderDate = new.orderDate,
    status = new.status,
    customerNumber = new.customerNumber;

insert into orders(orderNumber, orderDate, requiredDate, status, customerNumber) values 
(10426,	'2005-05-31', '2005-06-07', 'In Process', 119);









