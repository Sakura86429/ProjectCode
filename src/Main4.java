import java.util.Scanner;
import java.util.Stack;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @veansion 1.0
 * Create by 2022/8/31 21:31
 */
public class Main4 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[] arr1 = new int[n];
//        int[] arr2 = new int[n];
//        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();
//        int pre = Integer.MIN_VALUE;
//        int res = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            int index = findIndex(arr2, arr1[i]);
//            if (pre > index) res++;
//            pre = index;
//        }
//        System.out.println(res);
//    }
//
//    private static int findIndex(int[] arr2, int num) {
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] == num) return i;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sidex = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            sidex[s] = i + 1;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int id = sidex[p];
            while (stack.peek() > id) {
                stack.pop();
            }
            stack.add(id);
        }
        int ans = n - stack.size() + 1;
        System.out.println(ans);
    }
}
