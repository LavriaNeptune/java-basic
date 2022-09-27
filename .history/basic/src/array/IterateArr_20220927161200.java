package array;

public class IterateArr {
    public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4, 5 };
      // 常规的 for 循环迭代
      for (int i = 0; i < arr.length; i++) {
        System.out.printf("%d ", arr[i]);
        System.out.print('')
      }
      // for each 循环,直接迭代出数组的每个元素
      for (int i : arr) {
        System.out.printf("%d ", i);
      }
    }
}
