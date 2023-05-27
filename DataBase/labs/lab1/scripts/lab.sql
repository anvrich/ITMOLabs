CREATE TABLE Monolith (
    id SERIAL PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    weight FLOAT,
    location TEXT,
    length FLOAT,
    height FLOAT,
    energy_source TEXT NOT NULL,
    discovery_date DATE NOT NULL,
    description_energies TEXT NOT NULL
);

CREATE TABLE Material (
    id SERIAL PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    critical_temperature FLOAT,
    type TEXT,
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

CREATE TABLE Specialist_Isledovaniya(
    id SERIAL PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    gender VARCHAR(10),
    experience_years INTEGER NOT NULL,
    email TEXT UNIQUE
);

CREATE TABLE Specialist_Monolith_Isledovaniya(
    id SERIAL PRIMARY KEY,
    specialist_id INTEGER NOT NULL REFERENCES Specialist_Isledovaniya(id),
    monolith_id INTEGER NOT NULL REFERENCES Monolith(id)
);

CREATE TABLE Current_Magnetic_Field (
    id SERIAL PRIMARY KEY,
    current_id INTEGER NOT NULL REFERENCES Currents(id),
    magnetic_field_id INTEGER NOT NULL REFERENCES Magnetic_Fields(id)
);

CREATE TABLE Generator_Monolith(
    id SERIAL PRIMARY KEY,
    description TEXT NOT NULL,
    strength FLOAT NOT NULL,
    source TEXT NOT NULL,
    monolith_id INTEGER NOT NULL REFERENCES Monolith(id)
);

