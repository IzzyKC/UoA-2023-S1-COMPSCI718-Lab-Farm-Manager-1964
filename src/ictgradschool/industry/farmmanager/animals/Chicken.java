package ictgradschool.industry.farmmanager.animals;

public class Chicken extends Animal implements IProductionAnimal {
    private final int MAX_VALUE = 300;

    public Chicken() {
        value = 200;
    }

    @Override
    /**
     * Implement the feed method so that the value for the chicken increases when the chicken has been fed.
     * The formula for increasing the value is: value = value + (MAX_VALUE - value) / 2;
     *
     * Note that the value of the chicken should not exceed the MAX_VALUE.
     */
    public void feed() {
        if (value < MAX_VALUE) {
            value += (MAX_VALUE - value) / 2;
        }

    }

    @Override
    /**
     * Implement the costToFeed method to return 3 as the cost for feeding each chicken.
     */
    public int costToFeed() {
        return 3;
    }

    @Override
    /**
     * Implement the getType method to return Chicken.
     */
    public String getType() {
        return "Chicken";
    }

    /**
     * Implement the toString method so that the user knows what it is.
     * The String should be similar to the one in the Cow class.
     *
     * @return String
     */
    public String toString() {
        return getType() + " - $" + value;
    }


    @Override
    /**
     * You can always collect eggs from a chicken regardless of its value.
     */
    public boolean harvestable() {
        return true;
    }

    @Override
    /**
     * The money you can make from collecting eggs is $5.
     */
    public int harvest() {
        return 5;
    }
}
