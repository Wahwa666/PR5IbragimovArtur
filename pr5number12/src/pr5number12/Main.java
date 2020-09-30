package pr5number12;

public class Main {

    public static int recursion (){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n==0) {
            return 1;
        } else
        if (n%2 == 1) {
            System.out.println(n);
            return recursion();
        }
        return recursion();
    }

    public static void main(String[] args) {
       recursion();
    }
}
