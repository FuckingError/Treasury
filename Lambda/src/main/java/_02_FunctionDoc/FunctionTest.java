package _02_FunctionDoc;


import java.util.function.Function;

/**
 * 2020年9月16日 10:45:31
 */
public class FunctionTest{
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();

        System.out.println("自增：" + test.compute(1, value -> ++value));

        System.out.println("乘2：" + test.compute(2,value->value*2));

        System.out.println("大写转小写"+test.convert("ABC",String :: toLowerCase));
    }

    /*
    * Function<传入参数类型，返回结果类型>
    * */
    public int compute(int a,Function<Integer,Integer> function){
        return function.apply(a);
    }

    public String convert(String s,Function<String,String> function){
        return function.apply(s);
    }


}
