package _06_Optional;

import java.util.List;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/17 上午 10:33
 */
public class Company {
    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
