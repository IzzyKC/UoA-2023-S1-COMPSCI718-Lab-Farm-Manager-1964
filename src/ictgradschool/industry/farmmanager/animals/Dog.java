package ictgradschool.industry.farmmanager.animals;

public class Dog extends Animal {

    private final int MAX_VALUE = 600;

    @Override
    public void feed() {
        if (value < MAX_VALUE) {
            value += 50;
        }
    }

    @Override
    public int costToFeed() {
        return 30;
    }

    @Override
    public String getType() {
        return "Dog";
    }

    public String toString() {
        return getType() + " - $" + value;
    }
}
