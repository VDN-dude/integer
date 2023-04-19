public class Main {
    public static void main(String[] args) {
        IntegerWrapper integerWrapper = IntegerWrapper.valueOf(7777);
        IntegerWrapper integerWrapper1 = IntegerWrapper.valueOf(7777);
        System.out.println(integerWrapper == integerWrapper1);
    }
}