package day11;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpId(22);
        employee.setEmpName("ram");

        System.out.println("name is: " + employee.getEmpName());
        System.out.println("roll is: " + employee.getEmpId());
    }
}
