create database example;
use example;
create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);
alter table addresses
add primary key (id);
alter table addresses drop primary key;
describe addresses;

create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
alter table people add constraint pk_id primary key(id);
describe people;



create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);
alter table pets add column owner_name varchar(20);
alter table pets drop column owner_name;
alter table pets add constraint pk_id primary key(id);
alter table pets drop primary key;
alter table pets change name pet_name varchar(20);
alter table pets modify column owner_id varchar(20);
alter table pets modify column owner_id int;
alter table pets add constraint uk_species unique(species);
alter table pets drop constraint uk_species;
alter table pets add constraint fk_id foreign key(owner_id) references people(id);
alter table pets drop foreign key fk_id;
alter table pets drop index fk_id;
describe pets;
show create table pets;