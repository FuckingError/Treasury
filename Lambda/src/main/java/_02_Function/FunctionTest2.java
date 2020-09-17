package _02_Function;

import java.util.function.Function;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/16 下午 1:32
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        /**
         * Todo-comment lambda-08: Function compose 和 andThen
         */
        FunctionTest2 test = new FunctionTest2();
        System.out.println(test.compute(2,value -> value * 3,value -> value * value));
        System.out.println(test.compute2(2,value -> value * 3,value -> value * value));
    }

    public int compute(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }
}
