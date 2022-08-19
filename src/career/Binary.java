package career;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/19 10:30
 */
public class Binary {
    public static void main(String[] args) {
        String str1 =   "1010";
        String str2 = "111011";
        addBinary(str1, str2);
    }
    public static void addBinary(String s1, String s2) {
        int add = 0;
        int length1 = s1.length(), length2 = s2.length();
        int n = Math.max(length1, length2);
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < n; i++) {
            add += i < s1.length() ? (s1.charAt(s1.length() - 1 - i) - '0') : 0;
            add += i < s2.length() ? (s2.charAt(s2.length() - 1 - i) - '0') : 0;
            ans.append(add % 2);
            add /= 2;
        }
        if (add > 0) ans.append("1");
        ans.reverse();
        System.out.println(ans);

    }
}
