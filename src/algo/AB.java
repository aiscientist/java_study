package algo;

import java.util.Scanner;

class AB {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int minus = a - b;
        int mul = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(quotient);
        System.out.println(remainder);
    }
}