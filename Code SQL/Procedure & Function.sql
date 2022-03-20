-- This example using database from mysampledatabase.sql

DELIMITER $$
create procedure getCustomerNames()
begin
	select customerName from customers;
end; $$



