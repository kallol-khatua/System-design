public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("created a new row in employee table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        System.out.println("Employee deleted from the table");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        return new Employee();
    }
}
