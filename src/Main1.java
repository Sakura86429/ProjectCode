import java.util.Scanner;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/31 19:58
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 1;
        for (int i = 2; i <= n; i++) num += i;
        int[][] res = new int[num][2];
        int index = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i; j < n; j++) {
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                res[index][0] = max;
                res[index][1] = min;
                index++;
                if (min * k == max) ans++;
            }
        }
        System.out.println(ans);
    }
}
