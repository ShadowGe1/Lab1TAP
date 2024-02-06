import java.util.Scanner;

public class TextRedactor {
    private String TEXT;
    private final String SUBSIR;
    public TextRedactor(String TEXT, String SUBSIR){
        this.TEXT = TEXT;
        this.SUBSIR = SUBSIR;
    }

    public void redactare(){
        char caracter;
        int length = TEXT.length();
        Scanner sd = new Scanner(System.in);
        do {
            System.out.println("Introduceti caracterul dupa care se va introduce subsirul introdus: ");
            caracter = sd.next().charAt(0);
            for(int i = 0; i < TEXT.length(); i++){
                if(caracter == TEXT.charAt(i)){
                    TEXT = TEXT.substring(0, i + 1) + SUBSIR + TEXT.substring(i + 1);
                }
            }
            if(length == TEXT.length()){
                System.out.println("Caracterul introdus nu a fost gasit!!");
                continue;
            }
            System.out.println(TEXT);
        }while(length == TEXT.length());
        sd.close();
    }
}
