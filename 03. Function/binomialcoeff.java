//program to get the binomial coefficient using function
//factorial function is called 3 times in this code with made our work more easy

import java.util.*;

public class binomialcoeff {
    public static int facti(int a) {
        int fact = 1;
        for (int i = a; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static int bincoeff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of p");
        int p = sc.nextInt();
        System.out.println("Enter the value of q");
        int q = sc.nextInt();
        int p_fact = facti(p);
        int q_fact = facti(q);
        int pmq_fact = facti(p - q);
        int bincoeff = p_fact / (q_fact * pmq_fact);
        sc.close();
        return bincoeff;
    }

    public static void main(String args[]) {
        System.out.println("your binomial coefficient is:" + bincoeff());
    }
}