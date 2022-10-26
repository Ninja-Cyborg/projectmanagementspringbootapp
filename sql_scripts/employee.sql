CREATE DATABASE  IF NOT EXISTS `employee_database`;
USE `employee_database`;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `branch` varchar(45) DEFAULT NULL,
  `project_assigned` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- generated through https://mockaroo.com/

insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (1, 'Francisca', 'De Laci', 'fdelaci0@princeton.edu', 'New_York', 'Tresom');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (2, 'Templeton', 'Kienzle', 'tkienzle1@virginia.edu', 'Toronto', 'Trippledex_app');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (3, 'Eugen', 'Aronov', 'earonov2@uol.com.br', 'Melaka', 'Greenlam');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (4, 'Phyllys', 'Neligan', 'pneligan3@loc.gov', 'Vancouver', 'Hatity_app');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (5, 'Dyana', 'Wooder', 'dwooder4@mail.ru', 'New_York', 'Zathin');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (6, 'Ninnetta', 'Alyukin', 'nalyukin5@icio.us', 'Vancouver', 'Hatity_app');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (7, 'Shelbi', 'Cuerdale', 'scuerdale6@netlog.com', 'Toronto', 'Biodex_app');
insert into employee (id, first_name, last_name, email, branch, project_assigned)
 values (8, 'Hatty', 'Crews', 'hcrews7@phoca.cz', 'Vancouver', 'Hatity_app');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (9, 'Gerry', 'Capstake', 'gcapstake8@w3.org', 'Toronto', 'Flowdesk');
insert into employee (id, first_name, last_name, email, branch, project_assigned) 
values (10, 'Roberto', 'Witling', 'rwitling9@wufoo.com', 'Vancouver', 'Hatity_app');
