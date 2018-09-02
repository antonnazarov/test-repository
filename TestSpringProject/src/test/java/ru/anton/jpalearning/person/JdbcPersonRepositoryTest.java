package ru.anton.jpalearning.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.anton.jpalearning.config.DatabaseAccessConfig;
import ru.anton.jpalearning.config.DatabaseAccessScanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DatabaseAccessConfig.class, DatabaseAccessScanConfig.class})
public class JdbcPersonRepositoryTest {

    @Autowired 
    JdbcPersonRepository rep;
    
    @Test
    public void testGetMaxId() {
        int max = rep.getMaxPersonId();
        
        System.out.println("max id = [" + max + "]");
    }
    
    @Test
    public void testPersonInsert() {
        PersonTO p = new PersonTO(rep.getMaxPersonId()+1, "Aab", "Rollson", 100, "DEFAULT", 100, "The commant will be added here");
        rep.addPerson(p);
    }
}
