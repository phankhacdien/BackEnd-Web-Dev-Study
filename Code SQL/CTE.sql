-- This example using database from mysampledatabase.sql

with USA_city as (
	select * from customers
    where country = 'USA')
select * from USA_city
where city = 'las vegas';
