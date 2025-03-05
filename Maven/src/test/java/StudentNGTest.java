/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ADMIN
 */

public class StudentNGTest {
    
    private Student student;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Setup before class");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Cleanup after class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        // Khởi tạo đối tượng Student trước mỗi test case
        student = new Student("S001", "John Doe", 20);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        // Cleanup sau mỗi test case (nếu cần)
    }

    @Test
    public void testGetStudentId() {
        System.out.println("Testing getStudentId");
        String expected = "S001";
        String actual = student.getStudentId();
        assertEquals(actual, expected, "Student ID should be S001");
    }

    @Test
    public void testGetName() {
        System.out.println("Testing getName");
        String expected = "John Doe";
        String actual = student.getName();
        assertEquals(actual, expected, "Student name should be John Doe");
    }

    @Test
    public void testGetAge() {
        System.out.println("Testing getAge");
        int expected = 20;
        int actual = student.getAge();
        assertEquals(actual, expected, "Student age should be 20");
    }

    @Test
    public void testSetAge() {
        System.out.println("Testing setAge");
        student.setAge(25);
        int expected = 25;
        int actual = student.getAge();
        assertEquals(actual, expected, "Student age should be updated to 25");
    }

    @Test
    public void testUpdateName() {
        System.out.println("Testing updateName");
        student.updateName("Jane Doe");
        String expected = "Jane Doe";
        String actual = student.getName();
        assertEquals(actual, expected, "Student name should be updated to Jane Doe");
    }
}
