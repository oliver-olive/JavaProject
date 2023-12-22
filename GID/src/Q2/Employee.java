package Q2;

import java.io.Serializable;

public class Employee implements Serializable {
    int empId;
    String empName;
    String grade;

    public Employee(int empId, String empName, String grade) {
        this.empId = empId;
        this.empName = empName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", grade=" + grade + "]";
    }
}
