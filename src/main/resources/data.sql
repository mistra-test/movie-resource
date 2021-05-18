CREATE TABLE IF NOT EXISTS movie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
);

INSERT INTO movie (id, name, description) VALUES
  (1, 'Lord of the rings', 'Frodo and Sam are on holiday'),
  (2, 'Iron Man', 'W Tony Stark'),
  (3, 'Harry Potter', 'You are wizard Harry!');