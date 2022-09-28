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

    Person p = new Student();
    // 向上转型特性使 Person 引用类型的变量可以指向其子类类型 Student...
    p.run(); // Student run
    // 多态:针对某个类型的方法调用,其真正执行的方法取决于运行时期实际类型的方法...所以上面 p 执行的是 Student 类中的 run 方法...多态是一种非常强大的功能:允许添加更多类型的子类实现共嗯那个
  }
}
