package OOP_Java.seminar1_homework;

public class main {
    public static void main(String[] args) {
        hot_drink TeaLarge = new Tea("Green gunpowder", 130, 500, 95);
        hot_drink TeaMedium = new Tea("Green gunpowder", 110, 250, 95);
        hot_drink Cocoa = new cocoa("Cocoa with milk", 250, 250, 65);
        hot_drink CoffeEspresso = new cofee("Espresso", 80, 60, 80);

        machine DrinksVending = new Hot_drink_machine();

        DrinksVending.addDrink(TeaLarge);
        DrinksVending.addDrink(TeaMedium);
        DrinksVending.addDrink(Cocoa);
        DrinksVending.addDrink(CoffeEspresso);

        System.out.println(DrinksVending.getDrink("Green gunpowder"));
        System.out.println(DrinksVending.getDrink("Cocoa with milk", 250, 65));
        System.out.println(DrinksVending.getDrink("hot water"));

        System.out.println(DrinksVending.getDrink("Green gunpowder", 250));
    }
}
