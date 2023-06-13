package OOP_Java.seminar4_homework.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.ToString;
import seminar4_homework.service.TeacherGroupIterator;

@Getter
@ToString
public class TeacherGroup implements Iterable<Teacher> {

    private final List<Teacher> teachersList;

    public TeacherGroup() {
        teachersList = new ArrayList<>();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(teachersList);
    }

}
