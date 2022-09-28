package oop;

public class Overload {
  public static void main(String[] args) {
    class Hello {
      // 当同一类中存在一系列功能类似、仅仅是参数不同的方法 -> 可以将这一组方法设置为同名但是接收不同参数的方法 -> 所谓的方法重载:根据方法调用时参数
      public void hello() {
        System.out.println("Hello, world!");
      }

      public void hello(String name) {
        System.out.println("Hello, " + name + "!");
      }
    }
    Hello test = new Hello();

    test.hello(); // Hello, world!
    test.hello("Lavria"); // Hello, Lavria!
  }
}
