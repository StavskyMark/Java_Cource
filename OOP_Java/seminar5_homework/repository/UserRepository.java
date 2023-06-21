package OOP_Java.seminar5_homework.repository;

import seminar5_homework.model.User;

import java.util.List;

public interface UserRepository<T extends User> {
    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();

}