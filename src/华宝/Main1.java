package 华宝;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/9/2 20:12
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(formatDuration(60));
        System.out.println(formatDuration(3662));
    }
    public static String formatDuration(int seconds) {
        if(seconds == 0) return "now";

        int y = 0, d = 0, h = 0, m = 0;
        m = 60;
        h = m * 60;
        d = 24 * h;
        y = 365 * d;

        int count = 1;
        int yN = seconds / y;
        seconds -= y * yN;
        if(yN != 0) count++;

        int dN = seconds / d;
        seconds -= d * dN;
        if(dN != 0) count++;

        int hN = seconds / h;
        seconds -= h * hN;
        if(hN != 0) count++;

        int mN = seconds / 60;
        seconds -= 60 * mN;
        if(mN != 0) count++;

        String res = "";
        if(yN != 0) {
            if(yN == 1) {
                res = res + yN + "" + " " + "year";
            } else {
                res = res + yN + "" + " " + "years";
            }
            if (dN != 0 || hN != 0 || mN != 0 || seconds != 0) {
                if(count >= 3) res += ", ";
                else if(count == 2) res+= " and ";
                count--;
            }
        }

        if(dN != 0) {
            if(dN == 1) {
                res = res + dN + "" + " " + "day";
            } else {
                res = res + dN + "" + " " + "days";
            }
            if (hN != 0 || mN != 0 || seconds != 0) {
                if(count >= 3) res += ", ";
                else if(count == 2) res+= " and ";
                count--;
            }
        }
        if(hN != 0) {
            if(hN == 1) {
                res = res + hN + "" + " " + "hour";
            } else {
                res = res + hN + "" + " " + "hours";
            }
            if (mN != 0 || seconds != 0) {
                if(count >= 3) res += ", ";
                else if(count == 2) res+= " and ";
                count--;
            }
        }
        if(mN != 0) {
            if(mN == 1) {
                res = res + mN + "" + " " + "minute";
            } else {
                res = res + mN + "" + " " + "minutes";
            }
            if (seconds != 0) {
                if(count >= 3) res += ", ";
                else if(count == 2) res+= " and ";
                count--;
            }
        }
        if(seconds != 0) {
            if(seconds== 1) {
                res = res + seconds + "" + " " + "second";
            } else {
                res = res + seconds + "" + " " + "seconds";
            }
        }
        return res;
    }
}
