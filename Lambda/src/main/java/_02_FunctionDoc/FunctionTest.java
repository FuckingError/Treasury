package _02_FunctionDoc;


import java.util.function.Function;

/**
 * 2020年9月16日 10:45:31
 */
public class FunctionTest{
    public static void main(String[] args) {

    }

    /*
    * Function<传入参数类型，返回结果类型>
    * */
    public int compute(int a,Function<Integer,Integer> function){
        return function.apply(a);
    }


}
