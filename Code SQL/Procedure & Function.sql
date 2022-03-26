-- This example using database from mysampledatabase.sql
-- ========= Procedure example ==========
-- 1. no parameter
DELIMITER $$
create procedure getCustomerNames()
begin
	select customerName from customers;
end; $$
call getCustomerNames; $$


-- 2. "in" parameter
DELIMITER $$
create procedure getClassicCars(in productLine varchar(255))
begin
	select * from products where products.productLine = productLine;
end; $$
call getClassicCars('Classic Cars'); $$


-- 3. "out" parameter
DELIMITER $$
create procedure getTotalVintageCars(in productType varchar(255), out total int)
begin
	-- set @total = (select count(productLine) from products where products.productLine = productType);
    select count(*) into total from products
    where productLine = productType;
end; $$
call getTotalVintageCars('Vintage Cars', @total); $$
select @total; $$


-- 4. "inout" parameter
set @var = 100; $$
DELIMITER $$
create procedure addValue(in valueToAdd int, inout var int)
begin
	select @var := var + valueToAdd;
end; $$
call addvalue(100, @var); $$
select @var; $$


DELIMITER $$
create procedure setCount(inout count int, in inc int)
begin
	set count = 5 + inc;
end; $$
set @count = 0;
call setCount(@count,8);
select @count;


-- ========= Function example ==========
create function increasePaymentPrice(addValue decimal(10,2), priceValue decimal(10,2))
returns decimal(10,2) deterministic
begin
	declare newAmount decimal(10,2);
    set newAmount = addValue + priceValue;
	return newAmount;
end; $$

select *, increasePaymentPrice(100, amount)
from payments;









