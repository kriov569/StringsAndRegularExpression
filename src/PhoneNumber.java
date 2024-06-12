public class PhoneNumber {
    public static void main(String[] args) {
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        String number = "+79532697890";
        boolean result = number.matches(regex);
        System.out.println(result);
    }
}
