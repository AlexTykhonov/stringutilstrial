package stringutils;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Scanner;


public class StringUtilsTrial {

    public static void main(String[] args) throws IOException {

        Boolean checknumber1 = false;
        Boolean checknumber2 = false;

        // task #1
        System.out.println("Reverse for 'Calculator' is " + StringUtils.reverse("Calculator" + " :)"));

        int num1=0;
        int num2=0;



        // task #2
        while (checknumber1 == false) {

            try {
                System.out.print("Input a number #1: ");
                Scanner in = new Scanner(System.in);
                num1 = in.nextInt();
                checknumber1 = true;
                System.out.println("Мы успешно ввели " + num1);
            }

            catch (java.util.InputMismatchException exception)
            {checknumber1 = false;
                System.out.println("Пожалуйста, введите целое число!");}


        }

        while (checknumber2 == false) {

            try {
                System.out.print("Input a number #2: ");
                Scanner in2 = new Scanner(System.in);
                num2 = in2.nextInt();
                checknumber2 = true;
                System.out.println("Мы успешно ввели " + num2);
            }

            catch (java.util.InputMismatchException exception)
            {checknumber2 = false;
                System.out.println("Пожалуйста, введите целое число!");}
        }

        int num3=num1+num2;

        System.out.println("Сумма введенных чисел "+num3);


    }
}
