package chernovol.service3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two numbers to make calculation: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean-factory.xml");
        Calculator3 calculator3 = context.getBean("calculator3", Calculator3.class);
        System.out.println(calculator3.calculate(num1, num2));

        context.close();
    }
}
