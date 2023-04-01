import homeworkEight2.Employee;
import homeworkEight2.EmployeeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {

    @Test

    public void findByNameTest() {

        Employee emp1 = new Employee("Alex", 100);
        Employee emp2 = new Employee("Peter", 200);
        Employee emp3 = new Employee("John", 300);

        Employee employee[] = {emp1, emp2, emp3};
        Assert.assertEquals(EmployeeUtils.findByName("John", ));
    }
}
