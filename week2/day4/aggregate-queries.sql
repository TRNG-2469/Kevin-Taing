select count(order_id), avg(amount) from orders;

select customers.customer_id "ID", customers.name "Name", count(orders.order_id) "Num of Orders" from customers inner join orders on customers.customer_id = orders.customer_id group by customers.customer_id order by count(orders.order_id) desc;

select customers.customer_id "ID", customers.name "Name" from customers inner join orders on customers.customer_id = orders.customer_id group by customers.customer_id having sum(orders.amount) > 150.00;

select min(price), max(price), avg(price), count(distinct product_id) from product; 

select name from product group by name order by count(name) desc limit 3;