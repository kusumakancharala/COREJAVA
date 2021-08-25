import java.util.*;

public class Swap {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter the value of 'a':");
        a= sc.nextInt();

        System.out.println("enter the value of 'b':");
        b= sc.nextInt();

        temp= a;
        a=b;
        b= temp;

        System.out.println("After swapping a= " + a + "b=" + b);
    }

}
