package oop;

public class Inheritance {
  public static void main(String[] args) {
    class Person {
      private String name;
      private int age;
      // public -> private,使得外部无法直接访问修改字段值 -> 通过 public 的方法来操纵内部封装数据

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
  }

  class Student extends Person {
    private int score;

    public int getScore() {
      return this.score;
    }
    public void setScore(){}
    }
}
