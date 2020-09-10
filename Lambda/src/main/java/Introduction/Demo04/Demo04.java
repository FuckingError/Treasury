package Introduction.Demo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/10 下午 3:45
 */
public class Demo04 {
    public static void main(String[] args) {
        //Runnable接口
        new Thread(() -> System.out.println("hello world")).start();

        //遍历集合 小写转大写
        List<String> list = Arrays.asList("hello", "world", "hello world");
        //1.打印
        list.forEach(word -> System.out.println(word.toUpperCase()));

        //2.放入一个新集合
        List<String> newList = new ArrayList();
        //2.1放入新集合
        list.forEach(word -> newList.add(word.toUpperCase()));
        //2.2打印
        newList.forEach(word -> System.out.println(word));
    }
}
