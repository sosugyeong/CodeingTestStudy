-- 코드를 작성해주세요
select count(*) as fish_count, fish_name
from fish_info i
join fish_name_info n on i.fish_type = n.fish_type
group by fish_name
order by fish_count desc;