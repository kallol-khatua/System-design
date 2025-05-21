public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;
    EmployeeDaoProxy() {
        this.employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")){
            employeeDaoObj.create(client, obj);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")){
            employeeDaoObj.delete(client, empId);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")){
            return employeeDaoObj.get(client, empId);
        }

        throw new Exception("Access Denied");
    }
}
