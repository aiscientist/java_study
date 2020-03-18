import java.util.Scanner;

public class Remainder {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if (a <= 2 || b <= 2 ||) {
//            System.out.println("주어진 값이 2 이하입니다.");
//            break;
//        }
//        else {
//            continue;
//        }

        int first = (a+b) % c;
        int sec = (a%c + b%c) %c;
        int third = (a*b)%c;
        int forth = (a%c * b%c)%c;

        System.out.println(first);
        System.out.println(sec);
        System.out.println(third);
        System.out.println(forth);
    }
}
