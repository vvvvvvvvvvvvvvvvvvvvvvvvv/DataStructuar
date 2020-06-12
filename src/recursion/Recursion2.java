package recursion;

public class Recursion2 {

    public static void main(String[] args) {
        test(5);
    }

    public static void test(int n){
        if(n == 1){
            System.out.println("end");
            //return;
        }else {

            test(n - 1);
            System.out.println("second part");
        }
        System.out.println("res");
    }
}
