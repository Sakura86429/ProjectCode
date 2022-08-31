import java.util.Scanner;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/31 20:12
 */
public class Main2 {
    static int x;
    static boolean[] res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        res = new boolean[t];
        for (int s = 0; s < t; s++) {

            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            x = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
                sc.nextLine();
            }
            dfs(arr, n - 1, m - 1, 0, 0, arr[0][0], s);
//            for (int i = 0; i < t; i++) {
//                int[][] A = arr[i];
//                dfs(A, n - 1, m - 1, 0, 0, A[0][0], i);
//            }
        }
        for (int i = 0; i < t; i++) {
            if (res[i]) System.out.println("yes");
            else System.out.println("no");
        }
    }

    private static void dfs(int[][] a, int rows, int cols, int row, int col, int sum, int i) {
        if (row >= rows && col >= cols) {
            if (sum == x) {
                res[i] = true;
            }
            return;
        }
        if (row > rows || col > cols) return;
        if ((row + 1) <= rows) dfs(a, rows, cols, row + 1, col, sum + a[row + 1][col], i);
        if ((col + 1) <= cols) dfs(a, rows, cols, row, col + 1, sum + a[row][col + 1], i);
    }
}
