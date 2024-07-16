CREATE TABLE grades (
    id SERIAL PRIMARY KEY,
    subject VARCHAR(100) NOT NULL,
    grade INT NOT NULL,
    student_id INT NOT NULL
);
