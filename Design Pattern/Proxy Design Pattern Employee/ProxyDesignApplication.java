public class ProxyDesignApplication {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDaoObj = new EmployeeDaoProxy();
            employeeDaoObj.create("ADMIN", new Employee());
            System.out.println("Employee created");

            employeeDaoObj.delete("USER", 7);
            System.out.println("Employee deleted");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
