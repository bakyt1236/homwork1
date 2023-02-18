import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("сан жаз");
        while (a >= 0) {
            if (a == 10) {
                break;
            } else if (a == 15) {
                break;
            } else
                System.out.println("Сан киргиз");
            a = scanner.nextInt();
        }
        System.out.println("chygyp ketti");
    }
}





