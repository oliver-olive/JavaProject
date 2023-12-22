package Q2;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws InvalidGradeException, IOException {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter total number of employees");
        n = sc.nextInt();
        Employee[] e1 = new Employee[n];
        //Read user information
        input(n, e1, sc);
        System.out.println(e1.length);
        File file = new File("/Users/oliverzheng/Desktop/IdeaProjects/GID/src/Q2/empetails.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Employee e : e1) {
                oos.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("object was serialized");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                try {
                    Employee emps = (Employee) ois.readObject();
                    System.out.println("OBJREAD " + emps.toString());
                } catch (Exception e) {
                    System.out.println("Done for deserialize");
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Get user input
    public static void input(int n, Employee[] e1, Scanner sc) throws InvalidGradeException {
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the employee " + (i + 1) + "' empId(Int)");
            int empId = sc.nextInt();
            System.out.println("Please enter the employee " + (i + 1) + "' empName(String)");
            String empName = sc.next();
            System.out.println("Please enter the employee " + (i + 1) + "' grade(String)");
            String empGrade = sc.next();
            if (!isValidGrade(empGrade)) {
                throw new InvalidGradeException("The grade is invalid");
            }
            e1[i] = new Employee(empId, empName, empGrade);
        }
    }

    //check grade
    public static boolean isValidGrade(String grade) {
        String[] arr = {"U1", "U2", "U3", "U4", "P1", "P2"};
        for (String a : arr) {
            if (a.equals(grade)) {
                return true;
            }
        }
        return false;
    }
}
