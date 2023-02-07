import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomNums = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i = 1; i<=10; i++){
            randomNums.add(rand.nextInt(20)+1);
        }
        return randomNums;
    }

    public String getRandomLetter(){
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char randomLetter = alphabet.charAt(rand.nextInt(1, 26));

        return String.valueOf(randomLetter);
    }

    public String generatePassword() {
        String password = "";

        for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }

        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length){

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}
