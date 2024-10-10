import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введи три числа для белки:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if ((n*m)>=k) {
            System.out.println("еды хватит");
        }
        else {
            System.out.println("белка помрет с голоду");
        }
    }
}