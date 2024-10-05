public class SimpleDotGame {
        int[] locationCells;
        int numOfHits = 0;

        public void setLocationCells(int[] locationCells) {
                this.locationCells = locationCells;
        }

        public String checkYourself(String stringGuess) {
                int guess = Integer.parseInt(stringGuess);
                String result = "Missed";

                for (int cell : locationCells) {
                        if (guess == cell) {
                                result = "Hit";
                                numOfHits++;
                                break;
                        }
                }

                if (numOfHits == locationCells.length) {
                        result = "Kill";
                }

                System.out.println(result);
                return result;
        }


        public static void main(String[] args) {
                SimpleDotGame dot = new SimpleDotGame();
                int[] locations = {2, 3, 4};
                dot.setLocationCells(locations);

                String userGuess = "5";
                String result = dot.checkYourself(userGuess);

                String testResult = "failed";
                if (result.equals("Hit")) {
                        testResult = "passed";
                }

                System.out.println(testResult);
        }
}
