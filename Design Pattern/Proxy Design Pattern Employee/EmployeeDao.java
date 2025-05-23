public interface EmployeeDao {

    void create(String client, Employee obj) throws  Exception;

    void delete(String client, int empId) throws Exception;

    Employee get(String client, int empId) throws Exception;

}