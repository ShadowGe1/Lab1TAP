import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String Text = sc.nextLine();
        System.out.println("Introduceti textul inlocuit: ");
        String text = sc.nextLine();
        TextRedactor redactor = new TextRedactor(Text, text);
        redactor.redactare();
        sc.close();
    }
}
