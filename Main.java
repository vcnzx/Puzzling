import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PuzzleJava rolls = new PuzzleJava();

        ArrayList<Integer> randomRolls = rolls.getTenRolls();
        System.out.println(randomRolls);

        System.out.println(rolls.getRandomLetter());
        System.out.println(rolls.generatePassword());
        System.out.println(rolls.getNewPasswordSet(20));
    }
}
