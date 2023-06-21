package OOP_Java.seminar5_homework.view;

import OOP_Java.seminar5_homework.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber, String nameGroup); //POST
    void removeUser(String fullName); //DELETE
    int getMaxFullName();
    void buttonClickID();
    T getById(int hum);
}
