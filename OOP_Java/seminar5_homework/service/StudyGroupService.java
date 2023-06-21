package OOP_Java.seminar5_homework.service;

import OOP_Java.seminar5_homework.model.Student;
import OOP_Java.seminar5_homework.model.StudyGroup;
import OOP_Java.seminar5_homework.model.Teacher;


import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    public StudyGroupService(List<Teacher> teachersGroup, List<Student> studentsGroup) {
        this.teachersGroup = teachersGroup;
        this.studentsGroup = studentsGroup;
    }

    private final List<Teacher> teachersGroup;
    private final List<Student> studentsGroup;

    public List<Student> getStudentsGroup() {
        return studentsGroup;
    }

    public List<Teacher> getTeachersGroup() {
        return teachersGroup;
    }

    public List<Teacher> createTeacherGroup(String nameGroup) {
        List<Teacher> lS1 = new ArrayList<Teacher>();
        for (Teacher teacher : teachersGroup) {
            if (teacher.getNameGroup().equals(nameGroup)) {
                lS1.add(teacher);
            }
        }
        return lS1;
    }

    public List<Student> createStudentGroup(String nameGroup) {
        List<Student> lS = new ArrayList<Student>();
        for (Student student : studentsGroup) {
            if (student.getNameGroup().equals(nameGroup)) {
                lS.add(student);
            }
        }
        return lS;
    }





//    public List<Student> getByNameGroup(String nameGroup){
//        List<Student> students = studentRepository.getAll();
//        List<Student> lS = new ArrayList<Student>();
//        for (Student student : students) {
//            if (student.getNameGroup().equals(nameGroup)) {
//                lS.add(student);
//            }
//        }
//        return lS;
//    }

}
