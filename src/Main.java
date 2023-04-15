import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        Integer integer = Integer.valueOf(77);
//        Integer integer1 = Integer.valueOf(77);
        IntegerDecorator integerDecorator = new IntegerDecorator(7777);
        Integer integer = integerDecorator.valueOf();
        IntegerDecorator integerDecorator1 = new IntegerDecorator(7777);
        Integer integer1 = integerDecorator1.valueOf();
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer==integer1);

    }
}