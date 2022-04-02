package ua.ithillel;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guessedWord = getRandomWord(words);
        System.out.println(guessedWord);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your word");

        while (true) {
            String inputWord = scanner.nextLine();
            if (inputWord.equals(guessedWord)) {
                System.out.println("You are the winner!!!");
                break;
            } else if (!inputWord.matches("[a-z]+")) {
                System.out.println("This isn't a word. Try again.");
            } else {
                for (int i = 0; i < 15; i++) {
                    if (guessedWord.length() > i && inputWord.length() > i
                            && guessedWord.charAt(i) == inputWord.charAt(i)) {
                        System.out.print(inputWord.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
                System.out.println("Try again!");
            }
        }
        scanner.close();
    }

    public static String getRandomWord(String[] words) {
        Random rand = new Random();
        return words[rand.nextInt(words.length)];
    }
}
