CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  company VARCHAR(250) DEFAULT NULL,
  wealth VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Mukesh', 'Ambani', 'Reliance','$64.4 B'),
  ('Jeff', 'Bezos', 'Amazon','$166.3 B'),
  ('Bill', 'Gates', 'Microsoft','$109.9 B'),
  ('Mark', 'Zuckerberg', 'Facebook','$85.4 B');