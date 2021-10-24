package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void getNameTest() {
        Dog dog = new Dog("Tom", Breeds.CORGI, 6);
        assertEquals("Tom", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setAgeTestPositive() {
        Dog dog = new Dog("Tom", Breeds.CORGI, 6);
        dog.setAge(5);
        assertEquals(5, dog.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAgeTestNegative() {
        Dog dog = new Dog("Tom", Breeds.CORGI, 6);
        dog.setAge(-5);
        assertEquals(0, dog.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAgeTestZero() {
        Dog dog = new Dog("Tom", Breeds.CORGI, 6);
        dog.setAge(0);
        assertEquals(0, dog.getAge());
    }
}