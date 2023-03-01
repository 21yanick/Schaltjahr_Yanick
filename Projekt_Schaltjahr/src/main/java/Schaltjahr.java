import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte eine Jahreszahl eingeben: ");
        int year = scanner.nextInt();
        if (isSchaltjahr(year)) {
            System.out.println(year + " ist ein Schaltjahr");
        } else {
            if (isJahrhundert(year)) {
                System.out.println(year + " ist kein Schaltjahr, weil es sich um ein Jahrhundert handelt.");
            } else {
                System.out.println(year + " ist kein Schaltjahr.");
            }
        }
        scanner.close();
    }

    public static boolean isSchaltjahr(int year) {
        return year % 4 == 0 && ( !isJahrhundert(year) || year % 400 == 0 );
    }
    
    public static boolean isJahrhundert(int year) {
        return year % 100 == 0;
    }
}
