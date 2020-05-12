package HalfTest;


public class Main {

    public static String s;
    public static int mid;
    public static String[] halfS;

    public static void main(String[] args) {
        halfString(mid);
    }
    public static int halfString(int mid)
    {
        s = "Test";
        mid = s.length()/2;
        halfS = new String[]{s.substring(0, mid)};
        System.out.println(s);
        System.out.println(halfS[0]);
        System.out.println(mid);
        return mid;
    }



}
