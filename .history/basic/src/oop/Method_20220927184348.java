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

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age < 0 || age > 146) {
      throw new IllegalArgumentException("invalid age value");
    }
    this.age = age;
  }
}

public class Method {
  public static void main(String[] args) {
    Person p1 = new Person();

    p1.setName("Lavria");
    p1.setAge(16)

    System.out.println(p1.name);
    System.out.println(p1.age);
  }
}

