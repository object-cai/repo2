package com.chinasoft;

public class Teacher  extends Person{
    public Teacher(){
        System.out.println("this is a teacher");
    }
  @Override
    public void print(){
        System.out.println("I am a teacher");
    }

    public static void main(String[] args) {
        Person p = new Teacher();
        p.print();


    }
}
class Person{
    public Person(){
        System.out.println("this is a person");
    }

      public void print(){
          System.out.println("I am a person");
      }
        }