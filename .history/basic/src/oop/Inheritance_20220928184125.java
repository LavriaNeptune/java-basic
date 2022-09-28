package oop;

public class Inheritance {
  public static void main(String[] args) {
    class Person {
      protected String name;
      protected int age;
      // private -> protected,protected 修饰的字段可以被子类所访问...(讲访问控制权限定在继承树内部)

      public String getName() {
        return this.name;
        // this 始终指向当前实例...如果没有命名冲突的情况下 this 是可以省略的...
      };

      public void setName(String name) {
        this.name = name;
      };

      public int getAge() {
        return this.age;
      };

      public void setAge(int age) {
        if (age < 0 || age > 99) {
          throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
      };
    }
    // 通过 extends 关键字可以直接将父类的所有字段和方法提供给子类使用,是一种相当高效的代码复用方式...PS:子类不要定义与父类重名的字段
    class Student extends Person {
      // PS:Java 中一个类仅允许有一个父类
      private int score;

      public Student(){
        super();
        // 任何 class 的构造方法的第一行语句必须是调用父类的构造方法 -> 如果父类不存在无参数的构造方法,就必须手动地明确写出调用父类存在的某个构造方法!PS:可以看出来,子类是不会继承任何父类的构造方法的...
      }

      public int getScore() {
        return this.score;
      }

      public void setScore(int score) {
        this.score = score;
      }
    }
    
    Student s1 = new Student();
    // s1.name = "Lavria";
    s1.setName("Ming");
    System.out.println(s1.getName());
  }
}
