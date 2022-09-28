package oop;

public class Overload {
  public static void main(String[] args) {
    class Hello {
      // 当同一类中存在一系列功能类似、
      public void hello() {
        System.out.println("Hello, world!");
      }
      public void hello(String name) {
        System.out.println("Hello, " + name + "!");
      }
    }
  }
}
