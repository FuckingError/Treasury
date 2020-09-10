package _01_Introduction.Demo03;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/10 下午 3:17
 */
public class Demo03 {
    public static void main(String[] args) {
        /**
         * Todo-comment Lambda-03:lambda表达式 创建 函数式接口实例 通过 上下文推断
         *
         *     - 该上下文即：接收接口实例的函数式接口
         *     - Lambda表达式 仅关心 抽象方法的 `参数`与`返回值`
         *         - 函数式接口仅有一个抽象方法 因此：对于Lambda表达式来说 无需指明 函数名
         *             > 即：对于Lambda表达式来说 `函数式接口`中的`抽象方法名`无意义
         *                 > 但 对于 将 **`函数式接口`作为`方法参数`**的`调用方法`来说 **肯定是有意义的**
         */
        MyInterface1 interface1 = () -> {};
        System.out.println(interface1.getClass().getInterfaces()[0]);

        MyInterface2 interface2 = () -> {};
        System.out.println(interface2.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface MyInterface1{
    void Test1();
}

@FunctionalInterface
interface MyInterface2{
    void Test2();
}
