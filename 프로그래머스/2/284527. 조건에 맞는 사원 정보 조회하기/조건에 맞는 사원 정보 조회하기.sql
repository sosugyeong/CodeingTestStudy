-- 코드를 작성해주세요
select sum(SCORE) as SCORE, e.EMP_NO, e.EMP_NAME, e.POSITION, e.EMAIL
from HR_GRADE g
join hr_employees e on g.emp_no = e.emp_no
where g.year = '2022'
group by e.EMP_NO
order by score desc
limit 1;