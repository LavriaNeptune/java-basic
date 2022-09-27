package oop;

public class Class {
  public static void main(String[] args) {
    class Person {
        public String name;
        public int age;
    }
    Person p1 = new Person();
    p1.name = "Lavria";
    p1.age = 17;

    System.out.println(p1.name);
    System.out.println(p1.age);
  }
}
