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
public class JpaBasedAccessTest {

    @Autowired
    JpaPersonRepository rep;

    @Test
    public void testEntityManager() {
        Person p = new Person();
        
        p.setId(1000);
        p.setFirstName("Ronald");
        p.setSecondName("Raigan");
        p.setAge(90);
        p.setLanguage("ENG");
        p.setServiceMonths(20);
        p.setComment("Some comment");
        
        rep.addPerson(p);
    }

}
