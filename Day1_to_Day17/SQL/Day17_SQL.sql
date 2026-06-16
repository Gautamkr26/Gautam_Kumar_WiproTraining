CREATE DATABASE practice_day17;

USE practice_day17;

CREATE TABLE employees(
    emp_id INT,
    emp_name VARCHAR(50),
    department VARCHAR(50),
    salary INT
);

CREATE TABLE users(
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users VALUES('gautam','1234');



USE practice_day17;

SELECT * FROM employees; 



USE practice_day17;

SELECT * FROM employees WHERE salary > 50000;


USE practice_day17;

SELECT * FROM employees;






USE practice_day17;

DELIMITER //

CREATE PROCEDURE SearchEmployee(IN eid INT)

BEGIN

SELECT * FROM employees
WHERE emp_id = eid;

END //

DELIMITER ;

CALL SearchEmployee(1);


USE practice_day17;

SELECT COUNT(*) FROM employees;


USE practice_day17;

SELECT * FROM employees
WHERE salary=(SELECT MAX(salary) FROM employees);


USE practice_day17;

SELECT * FROM users;


USE practice_day17;

SELECT * FROM employees
ORDER BY department;

USE practice_day17;

SELECT * FROM employees;