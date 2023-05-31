package OOP_Java.seminar1_homework;

public interface machine {

    void addDrink(drink drink);

    drink getDrink(String name);

    drink getDrink(String name, Integer volume, Integer temp);

    drink getDrink(String name, Integer volume);

}