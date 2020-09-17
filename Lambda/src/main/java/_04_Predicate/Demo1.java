package _04_Predicate;

import java.util.function.Predicate;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/16 下午 4:50
 */
public class Demo1 {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length()>5;

        System.out.println(predicate.test("12345"));
    }
}
