package com.rest.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class InitDatabase implements InitializingBean {
    @Autowired
    private DataSource dataSource;

    @Override
    public void afterPropertiesSet() throws Exception {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();

        statement.executeUpdate("DROP TABLE IF EXISTS billionaires");
        statement.executeUpdate("CREATE TABLE billionaires (\n" +
                "  id INT AUTO_INCREMENT  PRIMARY KEY,\n" +
                "  first_name VARCHAR(250) NOT NULL,\n" +
                "  last_name VARCHAR(250) NOT NULL,\n" +
                "  company VARCHAR(250) DEFAULT NULL,\n" +
                "  wealth VARCHAR(250) DEFAULT NULL\n"+
                ")");
        statement.executeUpdate("INSERT INTO billionaires (first_name, last_name, company, wealth) VALUES\n" +
                "  ('Mukesh', 'Ambani', 'Reliance','$64.4 B'),\n" +
                "  ('Jeff', 'Bezos', 'Amazon','$166.3 B'),\n" +
                "  ('Bill', 'Gates', 'Microsoft','$109.9 B'),\n"+
                "  ('Mark', 'Zuckerberg', 'Facebook','$85.4 B');");
        statement.close();
        connection.close();
    }
}
