package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // 1. Общая сумма без скидки
    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // 2. Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double price = item.getAmount() * item.getPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                price = price * (100 - discount) / 100;
            }
            total += price;
        }
        return total;
    }

    // 3. Сумма вегетарианских продуктов без скидки
    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}