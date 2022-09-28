package oop;

public class Inheritance {
  public static void main(String[] args) {
    class Person {
      protected String name;
      protected int age;
      // public -> protected,为了

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
      private int score;

      public int getScore() {
        return this.score;
      }

      public void setScore(int score) {
        this.score = score;
      }
    }
    
    Student s1 = new Student();
    s1.name = "Lavria";
    System.out.println(s1.name);
  }
}
