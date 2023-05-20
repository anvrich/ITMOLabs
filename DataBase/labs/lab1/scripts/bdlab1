create table Monolith (
id serial primary key,
name varchar(256) not null,
weight float ,
location text ,
length float ,
hight float ,
energy_sourse text not null,
discovery_date date not null ,
description_energies text not null
);

CREATE TABLE Material (
    id SERIAL PRIMARY KEY,
    name varchar(256) NOT NULL,
    critical_temperature FLOAT ,
    type text,
    discovered_by TEXT
);

CREATE TABLE Currents (
    id SERIAL PRIMARY KEY,
    intensity FLOAT NOT NULL,
    direction TEXT NOT NULL,
    material_id INTEGER NOT NULL REFERENCES Material(id),
    monolith_id INTEGER NOT NULL REFERENCES Monolith(id)
);

CREATE TABLE Magnetic_Fields (
    id SERIAL PRIMARY KEY,
    intensity FLOAT NOT NULL,
    direction TEXT NOT NULL,
    creation_date DATE NOT NULL
);

create table specialist_isledovaniya(
id  serial primary key,
name varchar(256) not null,
gender varchar(10),
experience_years integer not null,
email text unique
);

create table specialist_monolith_isledovaniya(
    id serial primary key,
    spesialist_id INTEGER not null references specialist_isledovaniya(id),  
    monolith_id INTEGER not null references monolith(id)
);


 CREATE TABLE Current_Magnetic_Field (
       id serial primary key,
    current_id INTEGER NOT NULL REFERENCES Currents(id) ,
    magnetic_field_id INTEGER NOT NULL REFERENCES Magnetic_Fields(id)
);

CREATE TABLE generator_monolith(
id SERIAL PRIMARY KEY,
description TEXT NOT NULL,
strength FLOAT NOT NULL,
source TEXT NOT NULL,
monolith_id INTEGER NOT NULL REFERENCES Monolith(id)
);

