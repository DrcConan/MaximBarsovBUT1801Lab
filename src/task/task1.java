package task;
public class Task1 {
    public static void main(String[] msi) {

    }

    //#1
    public static int first(int a, int b) {
        return a % b;
    }

    //#2
    public static float second(int a, int b) {
        return (float) (a * b) / 2;
    }

    //#3
    public static int third(int chickens, int pig, int cow) {
        return chickens * 2 + pig * 4 + cow * 4;
    }

    //#4
    public static boolean fourth(float prob, int prize, int pay) {
        return prob * prize > pay;
    }

    //#5
    public static String fifth(int a, int b,int s) {
        if ((b - a == s) | (a - b == s)) return "substacted";
        if ((b + a == s)) return  "added";
        if ((b / a == s) | (a / b == s)) return  "division";
        if ((b * a == s)) return  "multiplication";
        return "none";
    }

    //#6
    public static int sixth(String s) {
        return s.charAt(0);
    }

    //#7
    public static int seventh(int a) {
        int s = 0;
        for (int i = 0; i <= a; i++) s += i;
        return (s);
    }

    //#8
    public static int eighth(int a, int b) {
        return (a + b - 1);
    }

    //#9
    public static int ninth(int... a) {
        int s = 0;
        for (int i : a) {
            s += Math.pow(i, 3);
        }
        return (s);
    }

    //#10
    public static boolean tenth(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return (a % c == 0);
    }
}
