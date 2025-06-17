create database details;
use details;
create table class (id int,name varchar(60),mark int,departement varchar(100),section varchar(10));
insert into class values(1,"Sibi",80,"BSc CS","II-C"),(2,"Gowtham",60,"BSc CS","II-C"),
(3,"Loki",89,"BSc CS","II-C"),(4,"Rushi",50,"BSc CS","II-C"),(5,"Mouni",45,"BSc CS","II-C");
update student set name="arun" where id=5;
select name from student where mark<60;
select departement from student where mark<60;
select section from student where mark<60;