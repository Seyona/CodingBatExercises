/**
 * Created with IntelliJ IDEA.
 * User: davidgbaker
 * Date: 5/3/14
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        return goal - big * 5 <= small
                && goal % 5 <= small;
    }

    public int loneSum(int a, int b, int c) {
        if (a == b && a == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;

        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;

        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return (fixTeen(a) + fixTeen(b) + fixTeen(c));
    }

    public int fixTeen(int n) {
        return  ( (n >= 13 && n < 15) || (n > 16 && n <= 19)) ? 0: n;
    }




}
