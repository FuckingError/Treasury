package _02_FunctionDoc;

import java.util.*;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/10 下午 5:08
 */
public class Demo02 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("b", "c", "a", "e");
        //逆置
        //Todo-Collect 01 : sort 按照 compare的结果 >0
      /*  Collections.sort(letters, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/

        Collections.sort(letters,(o1,o2) -> o2.compareTo(o1));

        System.out.println(letters);
    }
}
