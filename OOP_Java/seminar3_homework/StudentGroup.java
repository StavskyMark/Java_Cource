package OOP_Java.seminar3_homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
// @Data
public class StudentGroup implements Iterable<Student> {

    private final List<Student> studentsList;

    public StudentGroup() {
        studentsList = new ArrayList<>();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentsList);
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }
}
