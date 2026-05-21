# Write your MySQL query statement below
select round(
            count(distinct a.player_id)*1.0/(select count(distinct player_id) from activity ),2) as fraction
from activity a
join (
    select player_id ,MIN(event_date) as date_f
    from activity
    group by player_id
) b
on a.player_id = b.player_id and Datediff(a.event_date,b.date_f)=1;