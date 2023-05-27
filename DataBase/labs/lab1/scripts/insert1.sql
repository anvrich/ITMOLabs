INSERT INTO Monolith(name, weight, location, length, hight, energy_sourse, discovery_date, description_energies) 
VALUES ('Монолит1', 500, 'Место1', 10, 20, 'Солнечная', '2023-01-01', 'Описание1'), 
       ('Монолит2', 700, 'Место2', 15, 25, 'Ветровая', '2023-02-02', 'Описание2'), 
       ('Монолит3', 800, 'Место3', 20, 30, 'Геотермальная', '2023-03-03', 'Описание3');

INSERT INTO Material(name, critical_temperature, type, discovered_by) 
VALUES ('Материал1', 300, 'Тип1', 'Ученый1'), 
       ('Материал2', 400, 'Тип2', 'Ученый2'), 
       ('Материал3', 500, 'Тип3', 'Ученый3');



INSERT INTO Currents(intensity, direction, material_id, monolith_id) 
VALUES (100, 'Направление1', 1, 3), 
       (200, 'Направление2', 2, 1), 
       (300, 'Направление3', 3, 2);

INSERT INTO Magnetic_Fields(intensity, direction, creation_date) 
VALUES (500, 'Направление1', '2023-04-04'), 
       (600, 'Направление2', '2023-05-05'), 
       (700, 'Направление3', '2023-06-06');

INSERT INTO specialist_isledovaniya(name, gender, experience_years, email) 
VALUES ('Специалист1', 'Муж', 10, 'sp1@example.com'), 
       ('Специалист2', 'Жен', 12, 'sp2@example.com'), 
       ('Специалист3', 'Муж', 14, 'sp3@example.com');

    
INSERT INTO specialist_monolith_isledovaniya(spesialist_id, monolith_id) 
VALUES (1, 3), 
       (2, 1), 
       (3, 2);

INSERT INTO generator_monolith(description, strength, source, monolith_id) 
VALUES ('Описание1', 1000, 'Источник1', 2), 
       ('Описание2', 2000, 'Источник2', 3), 
       ('Описание3', 3000, 'Источник3', 1);


