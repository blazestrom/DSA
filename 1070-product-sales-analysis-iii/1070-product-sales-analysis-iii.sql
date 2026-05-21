# Write your MySQL query statement below
select a.product_id,b.first_year,a.quantity,a.price
from sales a
join 
( select product_id ,MIN(year) as first_year
from sales
group by product_id
    
    ) b
on a.product_id= b.product_id    
and a.year =b.first_year;