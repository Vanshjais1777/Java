import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        // create a object of Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:-");

        int age = sc.nextInt();
        System.out.println("Your age is :- " + age);
        sc.close();
    }
}