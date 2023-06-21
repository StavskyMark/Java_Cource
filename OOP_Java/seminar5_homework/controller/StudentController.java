package OOP_Java.seminar5_homework.controller;


import seminar5_homework.model.Student;
import seminar5_homework.service.StudentService;
import seminar5_homework.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String nameGroup) {
        studentService.create(fullName, age, phoneNumber, nameGroup);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }

    @Override
    public int getMaxFullName() {
        return studentService.getMaxFullName();
    }

    @Override
    public void buttonClickID() {    }

    public Student getById(int hum) { return studentService.getById(hum);}
}
