import java.util.Scanner;

public class IfConditionExample {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for temp");
        int temp=scanner.nextInt();

//        if(temp==100)
//            System.out.println("Temp is 100");
//        else
//            System.out.println("Temp is not 100");


//        if(temp>0)
//            System.out.println("Temp is Positive");
//        else
//            System.out.println("Temp is Negative");

//        Ternary operator
        System.out.println((temp>0)?"Temp is Positive":"Temp is Negative");

    }
}
