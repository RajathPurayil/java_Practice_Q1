import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to print the sum of two numbers from user input.


        Scanner sc= new Scanner(System.in);

        int sum=0;

        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the Second  number");
        int b= sc.nextInt();

        sum=a+b;


        System.out.println("The sum of given number is "+ sum);





    }
}