//program for simple calculator arithmetic operator use using switch statement

import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        sc.close();

        // There is no classical nextChar() method in Java Scanner class.
        // simple alternative to taking char input in Java would be the next().charAt(0)
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(p + q);
                break;
            case '-':
                System.out.println(p - q);
                break;
            case '*':
                System.out.println(p * q);
                break;
            case '/':
                System.out.println(p / q);
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}