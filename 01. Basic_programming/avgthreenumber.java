//program to find average of three numbers
import java.util.*;
public class avgthreenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int c = sc.nextInt();
        System.out.println("Enter the second number");
        int d = sc.nextInt();
        System.out.println("Enter the third number");
        int e = sc.nextInt();
        
        int average = (c+d+e)/3;
        System.out.printf("your average is %d", average);
        sc.close();
    }
}
