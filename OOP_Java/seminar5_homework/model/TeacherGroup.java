package OOP_Java.seminar5_homework.model;

import seminar5_homework.service.TeacherGroupIterator;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@ToString
//@Data
public class TeacherGroup implements Iterable<Teacher> {

    private final List<Teacher> teachersList;

    public TeacherGroup() {
        teachersList = new ArrayList<>();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teachersList);
    }

    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }
}
