import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Завдання 1
        int random = (int) (Math.random() * 41) - 20;
        System.out.println("Випадкове натуральне число : " + random);


        //Завдання 2
        int a = 3;
        int b = 4;
        double c = Math.sqrt((a * a) + (b * b));
        double p = a + b + c;
        double s = (0.5 * a * b);
        System.out.println("Периметр : " + p);
        System.out.println("Площа: " + s);

        //Завдання 3
        int r = (int) (Math.random() * 101);
        int m = String.valueOf(r).length();
        System.out.println("Випадкове натуральне число : " + r);
        System.out.println("Довжина : " + m);

        //Завдання 4
        int prog1, prog2, prog3, user1,user2,user3, sp = 0, max = 2;
        Scanner z = new Scanner(System.in);

        prog1 = (int) ((Math.random() * 3) + 1);
        prog2 = (int) ((Math.random() * 3) + 1);
        prog3 = (int) ((Math.random() * 3) + 1);

        System.out.println("Вгадайте правильну послідовність чисел від 1 до 3:");
        System.out.println("Перше число:" + prog1);
        System.out.println("Друге число:" + prog2);
        System.out.println("Третє число:" + prog3);

        while ( max > 0) {
            System.out.print("Введіть перше  число: ");
            if (z.hasNextInt()) {
                user1 = z.nextInt();
                System.out.print("Введіть друге  число: ");
                if (z.hasNextInt()) {
                    user2 = z.nextInt();
                    System.out.print("Введіть третє  число: ");
                    if (z.hasNextInt()) {
                        user3 = z.nextInt();
                        if (user1 == prog1 && user2 == prog2 && user3 == prog3) {
                            System.out.println("Ви вгадали!");
                            break;
                        } else {
                            System.out.println("Ви не вгадали.Кількість спроб:" + (1 - sp));
                            sp++;
                        }
                    } else {
                        System.out.println("Не вірно");
                    }
                    max--;
                }
            }
        }
    }
}