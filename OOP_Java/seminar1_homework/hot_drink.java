package OOP_Java.seminar1_homework;

public abstract class hot_drink extends drink {

    private int volume;
    private int temp;

    public hot_drink(String name, double price, int volume, int temp) {
        super(name, price);
        this.volume = volume;
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Горячий напиток " + getName() + ", цена=" + getPrice() +
                ", объем=" + getVolume() + ", температура=" + getTemp() +
                '}';
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}