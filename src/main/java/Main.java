import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем продукты
        Meat meat = new Meat(5, 100);  // 5 кг по 100 руб
        Apple redApples = new Apple(10, 50, Colour.RED);  // 10 кг по 50 руб
        Apple greenApples = new Apple(8, 60, Colour.GREEN);  // 8 кг по 60 руб

        // 2. Создаем массив продуктов
        Food[] items = {meat, redApples, greenApples};

        // 3. Создаем корзину
        ShoppingCart cart = new ShoppingCart(items);

        // 4. Выводим результаты
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPrice());
    }
}