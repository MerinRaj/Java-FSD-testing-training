use cofee_store;

select products.name,orders.order_time from orders
inner join products on products.id=orders.product_id
where products.name='Filter'
and orders.order_time between '2017-01-14' and '2017-01-31'
order by orders.order_time;


select p.name,p.price,o.order_time from orders o
join products p on p.id=o.product_id
order by o.order_time asc;

select p.name,p.price,o.order_time from orders o
join products p on p.id=o.product_id
where p.id=5
order by order_time asc;

select * from customers;

update orders
set customer_id=null
where id=1;
-- left join
-- Orders LEFT JOIN ON customers
select o.id,c.last_name,c.phone_number,o.order_time from orders o
left join customers c on o.customer_id=c.id
order by o.order_time
limit 10;

-- by inter changining the table-1 and table-2 positions
select o.id,c.last_name,c.phone_number,o.order_time from customers c
left join orders o on c.id=o.customer_id
order by o.order_time
limit 10;

-- RIGHT JOIN
-- Customers RIGHT JOIN on Orders
select o.id,c.last_name,c.phone_number,o.order_time from customers c
right join orders o on c.id=o.customer_id
order by o.order_time
limit 10;

select o.id,c.last_name,c.phone_number,o.order_time from  orders o
right join customers c on o.customer_id=c.id
order by o.order_time
limit 10;

update orders
set customer_id=1
where id=1;

-- all the tables join
select * from orders;
select * from customers;
select * from orders;


select p.name,p.price,c.first_name,c.last_name,o.order_time from products p
join orders o on p.id=o.product_id
join customers c on o.customer_id=c.id;

select p.name,p.price,c.first_name,c.last_name,o.order_time from products p
join orders o on p.id=o.product_id
join customers c on o.customer_id=c.id
where c.last_name='Martin'
order by o.order_time;
-- ------------------------------------------------------------------------------------------
-- Exercise-1
-- 1) select order id and customers phone number for all orders of product id 4.

select o.id,c.phone_number from orders o
join customers c  on o.customer_id=c.id
join products p on o.product_id=p.id
where p.id=4;

-- 2)select product name and order time for filter coffees sold between january 15th 2017 and february 14th 2017.

select p.name,o.order_time from products p
 join orders o on p.id=o.product_id
where o.order_time between '2017-01-15' and '2017-02-14' 
and p.name='Filter';


-- 3)select the product name and the price and order time for all the orders from femails in january 2017.

select p.name,p.price,o.order_time from orders o
 join products p on p.id=o.product_id
join customers c on c.id=o.customer_id
where c.gender='F'
and order_time between '20170101' and '20170131';
-- --------------------------------------------------------------------------------------------------------
/*INNER JOIN: Returns records that have matching values in both tables
LEFT JOIN: Returns all records from the left table, and the matched records from the right table
RIGHT JOIN: Returns all records from the right table, and the matched records from the left table*/