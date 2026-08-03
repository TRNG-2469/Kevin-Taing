create table products_udf(
product_id int primary key, 
product_name varchar(100) not null,
price decimal(10, 2) not null,
tax_rate decimal(4, 2) not null
)

insert into products_udf values(1, 'Laptop', 1300, 0.08), (2, 'Mouse', 20, 0.05);

create or replace function fn_calculate_tax(
item_price decimal, 
rate decimal
) returns decimal
language sql
as $$
	select item_price * rate;
$$;

-- call the function inside a query
select product_name, price, fn_calculate_tax(price, tax_rate) as "Total Tax" from products_udf

create or replace function fn_get_discount(item_price decimal) returns decimal
language plpgsql as $$
	declare 
		discount decimal:= 0.00;
	begin
		if item_price > 1000 then
			discount:= item_price * 0.10;
		elseif item_price > 100 then
			discount:= item_price * 0.05;
		else
			discount:= 0.00;
		end if;
		return discount;
end $$;

select product_name, price, fn_get_discount(price) as "Discount Applied" from products_udf
