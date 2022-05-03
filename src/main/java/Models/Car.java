package Models;

public class Car {

    private String name;
    private COLOR color;
    private int yearOfProduction;

    public Car(String name, COLOR color, int yearOfProduction) {
        this.name = name;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

}
