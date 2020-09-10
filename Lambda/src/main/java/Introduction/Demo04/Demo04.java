package Introduction.Demo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

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

        /**
         * Todo-comment Lambda-04: Lambda表达式的第二种写法：省略参数 采用 `类/对象 :: 方法名`
         *
         *    第二种：map的参数是一个函数式接口 Function
         *            Function接口内部有一个抽象方法`apply`
         *                这里`String::toUpperCase` 即：对该函数式接口中的accept方法的具体实现
         *
         *                  //即：第二种...的原始写法...
         *                  list.stream().map(new Function<String, Object>() {
         *                      @Override
         *                      public Object apply(String s) {
         *                          return s.toUpperCase();
         *                      }
         *                  });
         */
        //3.采用Stream 流
        /**
         * Todo-comment Lambda-05: 关于 stream的`map方法`
         *
         *     map方法中的函数式接口Function
         *         Function中的`apply方法` 接收参数 **返回结果**
         *             返回结果 作为 `map方法的具体实现` 中 `downstream.accept`方法的参数
         *                 **返回结果是一个Stream**
         */
        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));
    }
}
