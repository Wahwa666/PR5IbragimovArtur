package pr5number14;


public class Main {
    public static int recursion(int n) {
        if (n < 10) {
            System.out.println(n);
            return n;
        }
        else {
            System.out.println(n%10);
            return recursion(n / 10) ;

        }
    }
    public static void main(String[] args) {
	recursion (125);
    }
}
