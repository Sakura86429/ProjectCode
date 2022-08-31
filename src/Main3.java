import java.util.Scanner;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/31 20:50
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) System.out.println(9);
        else if (n == 2) System.out.println(80);
        else {
            int lx = 8, xx = 64, xl = 8;
            for (int i = 2; i < n; i++) {
                lx = xl * 8;
                xx = (xx + lx) * 8;
                xl = xx;
            }
            int res = lx + xx + xl;
            System.out.println(res);
        }
    }
}
