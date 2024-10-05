public class Main {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotcom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theDotcom.setLocationCells(locations); // fixed typo

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotcom.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false; // move this inside the if block
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

    }
    }

