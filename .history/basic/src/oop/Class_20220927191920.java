package oop;

public class Class {
  public static void main(String[] args) {

  class Person {
    public String name;
    public int age;
  }
  // 通过 class 关键字定义类 -> 类可以包含多个字段(用来描述类的一个特征) -> 数据封装
    Person p1 = new Person();
    // 根据对象模板(类)创建出真正的对象实例需要用到 new 操作符,创建出来的对象是所谓的引用变量,需要定义一个与其类的类型相同的引用变量来进行接收
    // 以上表示 定义一个名为 p1 类型为 Person 的引用变量接收通过 new Person() 生成的一个 Person 对象
    p1.name = "Lavria";
    p1.age = 17;

    System.out.println(p1.name);
    System.out.println(p1.age);
  }
}
// PS:一个 Java 源文件可以包含多个类的定义,但是只能定义一个 public 类...定义多个 public 类必须拆分到多个 Java 源文件中分别进行定义
