/*Display details of jobs where the minimum salary is greater than 10000.*/
select * from jobs where min_salary>10000;
/*Display the first name and join date of the employees who joined between 2002 and 2005.*/
select * from employees where TO_CHAR(hire_date,'YYYY') BETWEEN 2002 AND 2005 ORDER BY hire_date;
/*Display first name and join date of the employees who is either IT Programmer or Sales Man.*/
select first_name,hire_date from employees WHERE job_id IN('IT_PROG','SA_MAN');
/*Display employees who joined after 1st January 2008.*/
select * FROM employees where hire_date>'01-JAN-2008';
/*Display how many employees joined in each month of the current year.*/
select TO_CHAR(hire_date,'MM'),count(*) from employees where TO_CHAR(hire_date,'YYYY')=TO_CHAR(SYSDATE,'YYYY')GROUP BY TO_CHAR(hire_date,'MM');
/*Display job ID for jobs with average salary more than 10000.*/
select job_id,avg(salary) from employees GROUP BY job_id HAVING avg(salary)>10000
/*Change salary of employee 115 to 8000 if the existing salary is less than 6000.*/
update employees set salary=8000 where employee_id=115 and salary<6000;
/*Display departments where any manager is managing more than 5 employees.*/
select DISTINCT department_id FROM employees group by department_id,manager_id having count(employee_id)>5;
/*Display details of departments managed by ‘Smith’.*/
select * from departments where manager_id in(select employee_id from employees where first_name='SMITH');
/*Display employee name, job title, start date, and end date of past jobs of all employees with commission percentage null.*/
select first_name,job_title,start_date,end_date from job_history jhis join jobs jo using(job_id) join employees emp on (jhis.employee_id=emp.employee_id)
where emp.commission_pct is null;