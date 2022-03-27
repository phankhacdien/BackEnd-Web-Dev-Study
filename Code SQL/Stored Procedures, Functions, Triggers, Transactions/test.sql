use classicmodels;

delimiter //
create procedure getCustomerByCountry(in countryName varchar(255))
begin
	select * from customers
    where country = countryName;
end //
delimiter ;

call getCustomerByCountry('USA');

-- procedure with out parameters
delimiter //
create procedure getOrderByStatus(in orderStatus varchar(255), out total int)
begin
	select count(*)
    into total
    from orders
    where status = orderStatus;
end //
delimiter ;

-- call procedure
call getOrderByStatus('Shipped', @total);
select @total;

-- create procedure with inout
delimiter //
create procedure setCounter(inout counter int, in inc int)
begin
	set counter = counter + inc;
end //
delimiter ;

-- call procedure
call setCounter(@xyz, 3);
select @xyz;

