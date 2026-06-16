create database Employees_DB;
show databases;
use Employees_DB;

CREATE DATABASE Employees_DB;

USE Employees_DB;

CREATE TABLE Employees(
emp_id INT PRIMARY KEY,
emp_name VARCHAR(80),
department VARCHAR(100),
salary DECIMAL(10,2),
email VARCHAR(200),
joining_date DATE
);

INSERT INTO Employees(emp_id, emp_name, department, salary, email, joining_date)
VALUES
(1,'Gautam','IT',35000.50,'gautam@gmail.com','2026-07-22');

SELECT * FROM Employees;

INSERT INTO Employees(emp_id, emp_name, department, salary, email, joining_date)
VALUES
(5,'Aryan','IT',45000.00,'aryan@gmail.com','2026-07-22'),
(6,'Prince','HR',40000.00,'prince@gmail.com','2026-07-22'),
(7,'Dinesh','Finance',52000.50,'dinesh@gmail.com','2026-07-22'),
(8,'Anand','Marketing',39000.00,'anand@gmail.com','2026-07-22');


-- 1. Fetch all employees from the IT department
SELECT * FROM Employees
WHERE department = 'IT';

-- 2. Update salary for employees in the Testing department
SET SQL_SAFE_UPDATES = 0;
UPDATE Employees
SET salary = 55000
WHERE department = 'IT';

UPDATE Employees
SET salary = 65000
WHERE department = 'Marketing';

UPDATE Employees
SET salary = 85000
WHERE department = 'Finance';


-- 3. Delete an employee who resigned from the company
DELETE FROM Employees
WHERE emp_id = 6;

-- 4. Display employees sorted by highest salary
SELECT * FROM Employees
ORDER BY salary DESC;

-- 5. Fetch the top 2 highest-paid employees
SELECT * FROM Employees
ORDER BY salary DESC
LIMIT 2;

-- 6. Count total employees in the Employees table
SELECT COUNT(*) AS total_employees
FROM Employees;

-- 7. Calculate average salary of employees
SELECT AVG(salary) AS average_salary
FROM Employees;

-- 8. Find highest and lowest salary in the company
SELECT MAX(salary) AS highest_salary,
MIN(salary) AS lowest_salary
FROM Employees;

-- 9. Count employees department-wise using GROUP BY
SELECT department, COUNT(*) AS total_employees
FROM Employees
GROUP BY department;

-- 10. Display departments having more than one employee using HAVING
SELECT department, COUNT(*) AS total_employees
FROM Employees
GROUP BY department
HAVING COUNT(*) > 1;

-- 11. Find employees whose email IDs are NULL
SELECT * FROM Employees
WHERE email IS NULL;

-- 12. Fetch employees whose names start with letter 'A'
SELECT * FROM Employees
WHERE emp_name LIKE 'A%';

-- 13. Find employees whose salary is between 40000 and 60000
SELECT * FROM Employees
WHERE salary BETWEEN 40000 AND 60000;

-- 14. Fetch employees belonging to HR and IT departments
SELECT * FROM Employees
WHERE department IN ('HR','IT');

-- 15. Add a new column mobile_number to the Employees table
ALTER TABLE Employees
ADD mobile_number VARCHAR(15);

-- 16. Rename column emp_name to employee_name
ALTER TABLE Employees
RENAME COLUMN emp_name TO employee_name;

-- 17. Remove mobile_number column from Employees table
ALTER TABLE Employees
DROP COLUMN mobile_number;

-- 18. Delete all records from Employees table using TRUNCATE
TRUNCATE TABLE Employees;

-- 19. Permanently delete Employees table
DROP TABLE Employees;

-- 20. Fetch employee names along with department names using JOIN
SELECT e.emp_name, d.department_name
FROM Employees e
JOIN Departments d
ON e.department = d.department_name;

-- 21. Find employees earning more than average salary using subquery
SELECT * FROM Employees
WHERE salary >
(SELECT AVG(salary) FROM Employees);

-- 22. Find duplicate email records in Employees table
SELECT email, COUNT(*) AS duplicate_count
FROM Employees
GROUP BY email
HAVING COUNT(*) > 1;

-- 23. Verify employee data inserted successfully after API execution
SELECT * FROM Employees;

-- 24. Delete employees having NULL email IDs
DELETE FROM Employees
WHERE email IS NULL;

-- 25. Create backup of Employees table
CREATE TABLE Employees_Backup AS
SELECT * FROM Employees;