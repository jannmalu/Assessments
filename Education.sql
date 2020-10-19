CREATE DATABASE education;

CREATE TABLE student(
   studentid INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(250),
   course INT
);

CREATE TABLE course(
   courseid INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(250),
   institution INT
);

CREATE TABLE institution(
   institutionid INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(250)
);

SELECT COUNT(*) AS NumberOfStudents FROM student 
INNER JOIN course ON institution.name = course.name;
