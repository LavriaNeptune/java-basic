package oop;

public class Class {
  public static void main(String[] args) {
    class Person {
      public String name;
      public int age;
    }
    // 通过 class 关键字定义类 -> 类可以包含多个字段(用来描述类的一个特征) -> 数据封装
    
    Person p1 = new Person();
    // 
    p1.name = "Lavria";
    p1.age = 17;

    System.out.println(p1.name);
    System.out.println(p1.age);
  }
}
