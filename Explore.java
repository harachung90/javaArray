public class Explore {

    public static void main(String[] args) {
        // array of friends
        String[] friends = {"Ben", "Alena", "Hasan"};

        // enhanced for loop
/*        for(String friend:friends) {
            System.out.printf("Hey %s! The movie start 7. See you there! %n", friend);
        }

        for (int i = 0; i < friends.length; i++) {
            String friend = friends[i];
            System.out.printf("Hey %s! The movie start 7. See you there! %n", friend);
        }*/

/*        int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4,5, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
        for (int i = 0; i < bensScoreCard.length; i++) {
            System.out.printf("Hole #%d: %d %n", i+1, bensScoreCard[i]);
        }*/

        int[][] scoreCards = {
                // Ben's
                {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
                // Alena's
                {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
                // Pasan's
                {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2},
        };

        for (int i = 0; i < friends.length; i++) {
            System.out.printf("%s %n------------------------%n", friends[i]);
            for (int j = 0; j <scoreCards[i].length; j++) {
                System.out.printf("Hole #%d: %d %n", j+1, scoreCards[i][j]);
            }
        }
    }
}
