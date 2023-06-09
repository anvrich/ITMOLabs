INSERT INTO Monolith (name, weight, location, length, hight, energy_sourse, discovery_date, description_energies)
VALUES ('Монолит10', 5000.0, 'Местоположение1', 25.0, 50.0, 'Солнечная', '2022-01-01', 'Высокая энергия от солнечной энергии'),
       ('Монолит11', 6000.0, 'Местоположение2', 30.0, 60.0, 'Ветровая', '2022-06-01', 'Средняя энергия от ветровой энергии'),
       ('Монолит12', 7000.0, 'Местоположение3', 35.0, 70.0, 'Тепловая', '2022-12-01', 'Низкая энергия от тепловой энергии'),
       ('Монолит13', 8000.0, 'Местоположение4', 40.0, 80.0, 'Гидро', '2023-01-01', 'Средняя энергия от гидроэнергии'),
       ('Монолит14', 9000.0, 'Местоположение5', 45.0, 90.0, 'Геотермальная', '2023-06-01', 'Высокая энергия от геотермальной энергии');


INSERT INTO Material (name, critical_temperature, type, discovered_by)
VALUES ('Материал11', 2000.0, 'Тип1', 'Ученый1'),
       ('Материал21', 3000.0, 'Тип2', 'Ученый2'),
       ('Материал33', 4000.0, 'Тип3', 'Ученый3'),
       ('Материал44', 5000.0, 'Тип4', 'Ученый4'),
       ('Материал54', 6000.0, 'Тип5', 'Ученый5');


INSERT INTO Currents (intensity, direction, material_id, monolith_id)
VALUES (101.0, 'Север', 1, 3),
       (223.0, 'Восток', 2, 1),
       (33.0, 'Запад', 3, 5),
       (401.0, 'Юг', 4, 4),
       (125.0, 'Северо-Восток', 5, 2);


INSERT INTO Magnetic_Fields (intensity, direction, creation_date)
VALUES (10.5, 'Северо-Восток', '2023-01-01'),
       (122.5, 'Северо-Запад', '2023-02-01'),
       (343.54, 'Юго-Восток', '2023-03-01'),
       (514.51, 'Юго-Запад', '2023-04-01'),
       (95.5, 'Север', '2023-05-01');


INSERT INTO specialist_isledovaniya (name, gender, experience_years, email)
VALUES ('Иванов Иван', 'Мужской', 10, 'ivanov@example.com'),
       ('Петров Петр', 'Мужской', 8, 'petrov@example.com'),
       ('Сидорова Мария', 'Женский', 5, 'sidorova@example.com'),
       ('Михайлова Елена', 'Женский', 7, 'mikhailova@example.com'),
       ('Алексеев Алексей', 'Мужской', 9, 'alekseev@example.com');


INSERT INTO specialist_monolith_isledovaniya (spesialist_id, monolith_id)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);


INSERT INTO Current_Magnetic_Field (current_id, magnetic_field_id)
VALUES (1, 4),
       (2, 5),
       (3, 2),
       (4, 1),
       (5, 3);


INSERT INTO generator_monolith (description, strength, source, monolith_id)
VALUES ('Генератор1', 1000.0, 'Солнечная', 4),
       ('Генератор2', 2000.0, 'Ветровая', 2),
       ('Генератор3', 3000.0, 'Тепловая', 3),
       ('Генератор4', 4000.0, 'Гидро', 1),
       ('Генератор5', 5000.0, 'Геотермальная', 5);

