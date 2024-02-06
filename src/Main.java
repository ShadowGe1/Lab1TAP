import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Text, Subsir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        Text = sc.nextLine();
        System.out.println("Introduceti textul care doriti sa fie adaugat: ");
        Subsir = sc.nextLine();
        TextRedactor redactor = new TextRedactor(Text, Subsir);
        redactor.redactare();
        sc.close();
    }
}
