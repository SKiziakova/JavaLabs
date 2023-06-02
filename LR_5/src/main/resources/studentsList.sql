CREATE DATABASE IF NOT EXISTS studentsList;

USE studentsList;

DROP TABLE IF EXISTS Students;




CREATE TABLE Students

(

    [Id student]    int AUTO_INCREMENT NOT NULL,

    FirstName       nchar(20)        NOT NULL,

    LastName        nchar(20)        NOT NULL,

    Patronymic      nchar(20)        NOT NULL,

    BirthDate       date               NOT NULL,

    gradeBookNumber nchar(10) UNIQUE NOT NULL,

    PRIMARY KEY ([Id student])

);




INSERT INTO Students

VALUES (null, 'Іван', 'Понамарчук', 'Миколайович', '2001-03-14', '1247865');

INSERT INTO Students

VALUES (null, 'Олена', 'Шинкар', 'Анатоліївна', '2004-08-03', '3645879');

INSERT INTO Students

VALUES (null, 'Павло', 'Крамаренко', 'Іванович', '2000-01-04', '6547820');

INSERT INTO Students

VALUES (null, 'Максим', 'Гречко', 'Степанович', '2001-03-25', '3210448');

INSERT INTO Students

VALUES (null, 'Марія', 'Макаревич', 'Олександрівна', '2001-07-04', '2547365');

INSERT INTO Students

VALUES (null, 'Сніжана', 'Кізякова', 'Олегівна', '2002-12-13', '6472214');

INSERT INTO Students

VALUES (null, 'Дмитро', 'Глобенко', 'Петрович', '2003-11-23', '2146987');

INSERT INTO Students

VALUES (null, 'Олександр', 'Демчишин', 'Єгорович', '2002-02-10', '3648992');

INSERT INTO Students

VALUES (null, 'Анастасія', 'Мартинець', 'Іванівна', '1999-03-17', '7514982');

INSERT INTO Students

VALUES (null, 'Володимир', 'Дзюба', 'Кирилович', '1998-05-14', '1436785');

INSERT INTO Students

VALUES (null, 'Інна', 'Стасюк', 'Віталіївна', '2000-02-16', '4260071');

INSERT INTO Students

VALUES (null, 'Вікторія', 'Багмут', 'Станіславівна', '2000-05-19', '3647086');

INSERT INTO Students

VALUES (null, 'Діана', 'Коцур', 'Іванівна', '1999-07-21', '2034068');

INSERT INTO Students

VALUES (null, 'Назар', 'Ващенко', 'Леонідович', '2001-11-17', '1254764');

INSERT INTO Students

VALUES (null, 'Станіслав', 'Бородюк', 'Владиславович', '2002-03-05', '2146984');

INSERT INTO Students

VALUES (null, 'Владислав', 'Мацкевич', 'Петрович', '1999-07-08', '3647521');

INSERT INTO Students

VALUES (null, 'Софія', 'Барабаш', 'Володимирівна', '2004-07-11', '3458704');

INSERT INTO Students

VALUES (null, 'Світлана', 'Терещук', 'Юріївна', '2003-12-03', '6420894');

INSERT INTO Students

VALUES (null, 'Чумак', 'Анастасія', 'Володимирівна', '2003-11-30', '4598872');

INSERT INTO Students

VALUES (null, 'Іванішина', 'Марія', 'Іванівна', '2004-07-02', '1456924');