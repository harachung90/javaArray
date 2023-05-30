import java.io.Console;

public class Arrays {

    public static void main(String[] args) {
        Console console = System.console();

        String[] cowNames = {"Larry", "Susan", "Gerald", "Myrtle"};
        Cow[] cows = new Cow[cowNames.length];
        for (int i = 0; i < cowNames.length; i++) {
            cows[i] =  new Cow(cowNames[i]);
        }

        for (Cow cow:cows) {
            console.printf("%s%n", cow.getName());
        }
    }
}
