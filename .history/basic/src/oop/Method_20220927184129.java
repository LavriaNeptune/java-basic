package oop;

class Person {
  private String name;
  private int age;
  // public -> private,使得外部无法直接访问修改字段值
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return this.age;
  }

  public void setAge(int name) {
    this.name = name;
  }
}

public class Method {
  public static void main(String[] args) {
    Person p1 = new Person();

    p1.name = "Lavria";
    p1.age = 17;

    System.out.println(p1.name);
    System.out.println(p1.age);
  }
}

