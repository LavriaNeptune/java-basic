package oop;


public class ConstructionMethod {
  public static void main(String[] args) {
    class Person {
        private String name;
        private int age;
  
        public Person(String name, int age) {
          this.name = name;
          this.age = age;
        }

        public Person(String name) {
          this.name = name;
          this.age = age;
        }

        public String getName() {
          return this.name;
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
    Person p1 = new Person();

    // p1.setName("Lavria");
    // p1.setAge(99);

    System.out.println(p1.getName());
    System.out.println(p1.getAge());
  }
}

