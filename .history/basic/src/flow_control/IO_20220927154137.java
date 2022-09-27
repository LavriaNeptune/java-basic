package flow_control;

import java.util.Scanner;

public class IO {
  public static void main(String[] args) {
    System.out.println("Hello");
    // println -> print line 的缩写,实际上就是字符串打印函数 print() 在输出字符的末尾添加了换行符...
    System.out.printf("%.2f\n", 3.1415926);
    // pirntf -> print format 的缩写,表示输出格式化后的数据

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input your name:");
    String name = scanner.nextLine();
    // 键入回车后读取一行输入并转换为字符串格式
    System.out.print("Input your age:");
    int age = scanner.nextInt();
    // 键入回车后读取一行输入并转换为整型格式
    System.out.printf("Your name is %s,and you are %d years old!", name, age);
    scanner.close();
    // 用完记得关闭
  }
}
