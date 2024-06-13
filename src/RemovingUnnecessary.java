public class RemovingUnnecessary {
    public static void main(String[] args) {
        String text = "Пример текста с буквами и пробелами";
        String cleanedText = removeLettersAndSpaces(text);
        printResult(cleanedText);
    }

    public static String removeLettersAndSpaces(String text) {
        String regex = "[а-яА-Яa-zA-Z\\s]";
        return text.replaceAll(regex, "");
    }

    public static void printResult(String result) {
        System.out.println("Результирующая строка: " + result);
    }
}
