-- This example using database from mysampledatabase.sql

select * from customers;

select customers.customerNumber, customers.customerName, customers.phone, orders.orderNumber, orders.orderDate, orders.shippedDate, orders.status
from orders
inner join customers
on orders.customerNumber = customers.customerNumber;

select customers.customerNumber, customers.customerName, customers.phone, orders.orderNumber, orders.orderDate, orders.shippedDate, orders.status
from orders
left outer join customers
on orders.customerNumber = customers.customerNumber
order by customerNumber ASC;

select customers.customerNumber, customers.customerName, customers.phone, orders.orderNumber, orders.orderDate, orders.shippedDate, orders.status
from orders
full join customers
on orders.customerNumber = customers.customerNumber
order by customerNumber ASC;

select customers.customerNumber, customers.customerName, customers.phone, orders.orderNumber, orders.orderDate, orders.shippedDate, orders.status
from customers
cross join orders
on orders.customerNumber = customers.customerNumber
order by customerNumber ASC;
