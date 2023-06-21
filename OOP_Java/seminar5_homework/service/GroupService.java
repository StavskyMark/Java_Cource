package OOP_Java.seminar5_homework.service;

import OOP_Java.seminar5_homework.model.StudyGroup;

public interface GroupService<T extends StudyGroup> {
    void createGroup(String nameGroup);
}
