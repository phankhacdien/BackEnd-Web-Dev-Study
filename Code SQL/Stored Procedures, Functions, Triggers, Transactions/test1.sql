-- create function
delimiter //
create function CustomerLevel(credit decimal(10,2))
returns varchar(20) deterministic
begin
	declare customerLevel varchar(20);
    
    if credit > 50000 then
		set customerLevel = 'PLATINUM';
    elseif (credit = 50000 and credit >= 10000) then
		set customerLevel = 'GOLD';
    elseif (credit < 10000) then
		set customerLevel = 'SILVER';
    end if;
	
    return (customerLevel);
end //
delimiter ;

-- call the function
select customerName, CustomerLevel(creditLimit)
from customers
order by customerName;