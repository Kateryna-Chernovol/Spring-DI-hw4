package chernovol.service2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two numbers to make calculation: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        ApplicationContext context =
                new AnnotationConfigApplicationContext("chernovol.service2");
        Calculator2 calculator2 = context.getBean("calculator2", Calculator2.class);
        System.out.println(calculator2.calculate(num1, num2));
    }
}