package oop;

public class Polymorphic {
  public static void main(String[] args) {
    class Person {
      public void run() {
        System.out.println("Person run");
      }
    }
    class Student extends Person {
      public void run() {
        System.out.println("Student run");
      }
    }
  }
}
