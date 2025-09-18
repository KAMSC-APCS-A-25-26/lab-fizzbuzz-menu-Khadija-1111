import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        // TODO WRITE CODE HERE
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n");
            System.out.println("--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    int num1 = 3;
                    for (int j=0 ; num1 <= 100; j++)
                    {
                        if (num1 % 3 == 0)
                        {
                            System.out.print(num1 + " ");
                        }
                        num1 =  num1 + 1;
                    }
                    break;
                case 2:
                    int num2 = 5;
                    for (int j=0 ; num2 <= 100; j++)
                    {
                        if (num2 % 5 == 0)
                        {
                            System.out.print(num2 + " ");
                        }
                        num2 =  num2 + 1;
                    }
                    break;
                case 3:
                    int num = 3;
                    for (int j=0 ; num <= 100; j++)
                    {
                        if (num % 3 == 0 && num % 5 ==0)
                        {
                            System.out.print(num + " ");
                        }
                        num =  num + 1;
                    }
                    break;
                case 4:
                    running = false;

            }

        }



    }
}