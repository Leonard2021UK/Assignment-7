package com.coderscampus.arraylist;

/**
 * Test class to test custom data type
 */
public class TestClass{
    public String name;

    public TestClass(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
