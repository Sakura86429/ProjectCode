import java.util.Scanner;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/31 22:42
 */
public class Main6 {
    static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        int[][] mArr = new int[m][3];
        for (int i = 0; i < m; i++) {
            mArr[i][0] = sc.nextInt();
            mArr[i][1] = sc.nextInt();
            mArr[i][2] = sc.nextInt();
            sc.nextLine();
        }
        int[] newArr = new int[n];
        int[] arr = new int[n];
        dfs(arr, mArr, newArr, 0, 0);
        System.out.println(res);
    }
    private static void dfs(int[] arr, int[][] mArr, int[] newArr, int index, int sum) {
        if (Accessible(newArr, mArr)) {
            res = Math.max(res, sum);
        }
        if (index >= newArr.length) return;
        dfs(arr, mArr, newArr, index + 1, sum);
        newArr[index] = 1;
        dfs(arr, mArr, newArr, index + 1, sum+1);
        newArr[index] = 0;   // 必须加上
    }
    public static boolean Accessible(int[] newArr, int[][] mArr) {
        for (int i = 0; i < mArr.length; i++) {
            int num = 0;
            int l = mArr[i][0] - 1, r = mArr[i][1] - 1;
            int maxNum = mArr[i][2];
            for (int j = l; j <= r; j++) {
                if (newArr[j] == 1) num++;
            }
            if (num > maxNum) return false;
        }
        return true;
    }
}

