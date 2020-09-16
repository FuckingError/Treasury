package _02_FunctionDoc;

import java.util.function.BiFunction;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/16 下午 4:25
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        /**
         * Todo-comment lambda-09: BiFunction的使用
         */
        BiFunctionTest biFunctionTest = new BiFunctionTest();
        System.out.println(biFunctionTest.compute(1,2,(a,b) -> a+b));
        System.out.println(biFunctionTest.compute(1,2,(a,b) -> a-b));
        System.out.println(biFunctionTest.compute(1,2,(a,b) -> a*b));
        System.out.println(biFunctionTest.compute(1,2,(a,b) -> a/b));
    }

    public int compute(int a, int b, BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(a,b);
    }
}
