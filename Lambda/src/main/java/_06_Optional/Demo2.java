package _06_Optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/17 上午 10:33
 */
public class Demo2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("zhangsan");

        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("company1");

        List<Employee> employees = Arrays.asList(employee1, employee2);
        company.setEmployees(employees);

        /**
         * Todo-comment Optional  ofNullable of 等...
         */
        Optional<Company> optional = Optional.of(company);

        /**
         * Todo-comment Optional
         *     对optional中的value进行判断
         *           如果isPresent 则 apply 返回一个 Optional
         *           然后可以对这个Optional调用一些方法
         */
        //取出company中的员工集合 遍历打印员工名称
        optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()).forEach(item -> System.out.println(item.getName()));

        /**
         * Todo-comment Optional 没有序列化  不要作为成员变量去定义 只作为返回值 确保不会空指针
         */


    }
}
