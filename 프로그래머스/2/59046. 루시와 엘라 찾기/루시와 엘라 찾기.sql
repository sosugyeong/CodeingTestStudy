-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
from animal_ins
where name = 'lucy' or name = 'ella' or name = 'pickle' or name = 'rogan' or name = 'sabrina' or name = 'mitty'
order by animal_id asc;