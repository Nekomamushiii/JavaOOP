package WorkingAbstractionExe.Card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input+":");
        for(CardSuit card: CardSuit.values()){
            System.out.printf("Ordinal value: %d; Name value: %s\n",card.getValue(),card);
        }
    }
}
