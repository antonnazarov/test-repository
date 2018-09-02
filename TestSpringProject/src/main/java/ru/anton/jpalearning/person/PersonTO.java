package ru.anton.jpalearning.person;

public class PersonTO {
    private int id;
    private String firstName;
    private String secondName;
    private int age;
    private String language;
    private int serviceMonths;
    private String comment;
    
    /**
     * Construct a new Person.
     */
    public PersonTO(int id, String firstName, String secondName, int age, String language, int serviceMonths, String comment) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.language = language;
        this.serviceMonths = serviceMonths;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getServiceMonths() {
        return serviceMonths;
    }

    public void setServiceMonths(int serviceMonths) {
        this.serviceMonths = serviceMonths;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
