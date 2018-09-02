package ru.anton.jpalearning.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Simple testing class for DB- access.
 * 
 * @author Anton Nazarov
 * @since 02/09/2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DatabaseAccessConfig.class)
public class DatabaseAccessTest {
    
    @Autowired
    private DataSource ds;
    
    @Test
    public void testGetConnection() throws Exception {
        Connection conn = ds.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from person");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("first_name") + " " + rs.getString("second_name"));
        }
        
        conn.close();
    }
 }
