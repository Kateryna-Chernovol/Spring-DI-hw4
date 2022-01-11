package chernovol.service1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two numbers to make calculation: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Calculator calculator = context.getBean("calculate", Calculator.class);
        System.out.println(calculator.calculate(num1, num2));
        context.close();
    }
}
