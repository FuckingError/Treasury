package _02_FunctionDoc;

import java.util.function.Function;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/10 下午 4:59
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * Todo-comment lambda-06 : 关于 :: 双冒号
         *
         *     类 :: 实例方法(非静态方法)
         *     该类的类型 即：对应`Lambda表达式` **第一个参数**的类型
         */
        Function<String,String> function = String::toUpperCase;//对函数式接口的具体实现
        System.out.println(function.apply("s"));
    }
}
