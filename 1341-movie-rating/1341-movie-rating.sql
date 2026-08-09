# Write your MySQL query statement below
(select name  as results
from users
join movierating using (user_id)
group by user_id
order by count(rating )desc , name  limit 1)

union all
(select title as results
from movies
join movierating using(movie_id)
WHERE created_at >= '2020-02-01'
  AND created_at < '2020-03-01'
group by title 
order by avg(rating)desc ,title limit  1)