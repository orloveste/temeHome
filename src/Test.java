import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            int an;
            Scanner in = new Scanner(System.in);
            an = in.nextInt();

            if (((an% 4 == 0) && (an % 100 != 0)) || (an % 400 == 0)) {
                System.out.println("Este");
            } else {
    System.out.println("Nu este");
            }
        }
    }

