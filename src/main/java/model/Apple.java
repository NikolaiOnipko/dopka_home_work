package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour;  // цвет яблок

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;  // яблоки вегетарианские
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        // Скидка только для красных яблок
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE;
        }
        return 0;
    }
}