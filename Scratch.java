import java.util.Random;

public class Scratch {
    String[] friends = {"Ben", "Alena", "Hasan"};

    public String pickLunchSpot(String... spots) {
        System.out.printf("Randomly picking %d lunch spots.%n", spots.length);
        if (spots.length == 0) {
            return "Someplace with tacos";
        }
        Random random = new Random();

        return spots[random.nextInt(spots.length)];
    }

}
