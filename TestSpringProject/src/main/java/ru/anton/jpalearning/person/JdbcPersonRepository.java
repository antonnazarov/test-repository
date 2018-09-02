package ru.anton.jpalearning.person;

import javax.inject.Inject;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPersonRepository implements PersonRepository {

    public static final String INSERT_PERSON = "insert into person values (?, ?, ?, ?, ?, ?, ?)";

    private JdbcOperations jdbcOperations;

    @Inject
    public JdbcPersonRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public void addPerson(PersonTO person) {
        jdbcOperations.update(INSERT_PERSON, person.getId(), person.getFirstName(), person.getSecondName(),
                person.getAge(), person.getLanguage(), person.getServiceMonths(), person.getComment());
    }

    @Override
    public PersonTO getPerson(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonTO getPerson(String firstName, String secondName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson(PersonTO person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePerson(int personId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxPersonId() {
        Integer max = jdbcOperations.queryForObject("select max(id) from person", Integer.class);
        
        return max.intValue();
    }
}
