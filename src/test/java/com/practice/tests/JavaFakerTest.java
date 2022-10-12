package com.practice.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerTest {

    @Test
    public void testJavaFaker(){
        Faker faker=new Faker();
        String fistName=faker.name().firstName();
        System.out.println("fistName = " + fistName);
        String lastName=faker.name().lastName();
        System.out.println("lastName = " + lastName);
        String fullName=faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String address=faker.address().fullAddress();
        System.out.println("address = " + address);

        String phoneNumber=faker.phoneNumber().phoneNumber();
        System.out.println("phoneNumber = " + phoneNumber);

        String cc=faker.business().creditCardNumber();
        System.out.println("cc = " + cc);

        String emailAdress=faker.internet().emailAddress();
        System.out.println("emailAdress = " + emailAdress);


    }
}
