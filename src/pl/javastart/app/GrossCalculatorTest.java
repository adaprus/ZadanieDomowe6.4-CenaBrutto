package pl.javastart.app;

import pl.javastart.model.Product;
import pl.javastart.model.GrossCalculator;

public class GrossCalculatorTest {
    public static void main(String[] args) {
        Product product1 = new Product("Marchew", "Młoda marchew", 4.6, "A");
        Product product2 = new Product("Ariel", "Płyn do prania", 29.99, "C");
        GrossCalculator calculator = new GrossCalculator();

        System.out.println(product1.getName() + ": cena brutto: " + calculator.calculateGrossPrice(product1));
        System.out.println(product2.getName() + ": cena brutto: " + calculator.calculateGrossPrice(product2));
    }
}
