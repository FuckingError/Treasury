package Introduction;

/**
 * 函数式接口实践
 *
 * @author Qing
 * @version 1.0
 * @date 2020/9/10 上午 11:21
 */

@FunctionalInterface
interface MyInterface{
    void test();
}

public class Demo02 {
    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Demo02 demo = new Demo02();
        demo.myTest(()->System.out.println("测试"));//将 方法的实现 作为参数 传入(之前是采用`匿名内部类`的方式)
        System.out.println("---------");

        /**
         * Todo-comment Lambda-02:Java中的Lambda表达式是对象(即：函数式接口)
         */
        MyInterface myInterface = () -> {
            System.out.println("直接采用Lambda进行实现函数式接口");
        };

        //myInterface的类型
        System.out.println(myInterface.getClass());
        //myInterface的父类
        System.out.println(myInterface.getClass().getSuperclass());
        //myInterface的实现类
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
