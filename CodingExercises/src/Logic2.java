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

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        return (int)(Math.round((float)num / 10.0) ) * 10;
    }

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(a - b)  <= 1 && (Math.abs(a - c) > 1 && Math.abs(b - c) > 1) )
                || ((Math.abs(a - b) > 1 && Math.abs(b - c) > 1) && Math.abs(a - c) <= 1);
    }

    public int blackjack(int a, int b) {
        if (a == 21 || b == 21) return 21;
        if (a - 21 > 0 && b - 21 > 0) return 0;
        if(a > 21 && b < 21) return b;
        if (b < 21 && Math.abs(a- 21) > Math.abs(b - 21)) return b;
        return a;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int mid = Math.max(Math.min(a, b), c);
        int mid2 = Math.min(Math.max(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        return Math.abs(min - mid) == Math.abs(mid - max) ||
                Math.abs(min - mid2) == Math.abs(mid2 - max);
    }

    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (big > maxBig)
            return (goal <= 5 * maxBig + small) ? (goal - 5 * maxBig) : -1;
        return (goal <= 5 * big + small) ? (goal - 5 * big) : -1;
    }






}
