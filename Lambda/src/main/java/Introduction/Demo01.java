package Introduction;

import java.util.Arrays;
import java.util.List;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/9/10 上午 10:56
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        /*
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer*2);
            }
        });
        */

        /**
         * Todo-Comment Lambda-01:foreach 这里i没有定义类型 因为自动推断
         * foreach的参数是 `函数式接口` Consumer
         *     该函数式接口内部只有一个抽象方法accept
         *         accept的参数是一个 `泛型类型`的一个变量
         *             该泛型是由Consumer的泛型推断的
         *                 Consumer的泛型是由foreach所在的Iterator接口后面的泛型推断的
         */
        list.forEach(i -> {
            System.out.println(i);
        });

        //更进一步：method-reference
        list.forEach(System.out::println);
    }
}
