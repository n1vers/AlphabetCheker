package ee.ivkhkdev;

import java.util.HashSet;
import java.util.Set;

public class App {

    public void run(){
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";

        if (containsAllRussianLetters(text)) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }
    }

    public static boolean containsAllRussianLetters(String text) {

        text = text.toLowerCase().replaceAll("[^а-яё]", "");


        for (char letter = 'а'; letter <= 'я'; letter++) {
            if (!text.contains(String.valueOf(letter))) {
                return false;
            }
        }


        if (!text.contains("ё")) {
            return false;
        }

        return true;
    }

}
