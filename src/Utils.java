import java.util.Scanner;

public interface Utils {
    static int scanInt(String hint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint);
        return scanner.nextInt();
    }
    static String scanStr(String hint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint);
        return scanner.nextLine();
    }
}
