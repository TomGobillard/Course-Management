INSERT INTO Teacher VALUES(1, 'Rodislav', 'Moldovan', 'rmoldovan@univ-lorraine.fr');
INSERT INTO Room VALUES(1, 3);
INSERT INTO Course(id, name, teacher_id, room_id) VALUES (1, 'Mathematics', 1, 1);

INSERT INTO Student (id, first_name, last_name, email, student_class, id_course)
VALUES(1, 'Tom', 'Gobillard', 'tom.goo@hotmail.com', 'M2 MIAGE', 1);

INSERT INTO Student (id, first_name, last_name, email, student_class, id_course)
VALUES(2, 'Maxime', 'Marigliano', 'maximmrg@hotmail.com', 'M2 MIAGE', 1);