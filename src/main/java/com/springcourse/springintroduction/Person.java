package com.springcourse.springintroduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

//@Component("personBean")
@Scope("prototype")
public class Person {

//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private String age;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

/*    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;

        System.out.println("Pet = " + pet.toString());

    }
*/
    /*public Person() {
        System.out.println("Person constructor is created");
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        System.out.println("Set age");
        this.age = age;
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }
}
