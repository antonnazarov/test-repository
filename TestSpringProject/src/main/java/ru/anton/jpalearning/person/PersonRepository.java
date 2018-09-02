package ru.anton.jpalearning.person;

public interface PersonRepository {
    void addPerson(PersonTO person);
    PersonTO getPerson(int id);
    PersonTO getPerson(String firstName, String secondName);
    void updatePerson(PersonTO person);
    void deletePerson(int personId);
    int getMaxPersonId();
}
