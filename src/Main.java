public class Main {
    public static void main(String[] args) {
        String text = "В тексте, который вы видите на этом изиображении, посчитайте количество букв 'е' в каждом слове";
        String[] words = text.split("\\s+");

        for (String word : words) {
            int count = countLetterInWord(word, 'е');
            System.out.println("Слово \"" + word + "\": " + count);
        }
    }

    public static int countLetterInWord(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}

