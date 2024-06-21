import java.util.Scanner;

public class Subtract_sum_product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a=in.nextInt();
        System.out.print("Enter the number 2: ");
        int b=in.nextInt();
        System.out.println(diff_product_sum(a,b));
    }
    static int diff_product_sum(int a,int b){
        int diff = (a*b) - (a+b);
        return diff;
    }
}
