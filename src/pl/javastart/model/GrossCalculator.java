package pl.javastart.model;

public class GrossCalculator {


    public double calculateGrossPrice(Product product) {
        double grossPrice;

        switch (product.getCategory()) {
            case "A":
                grossPrice = 1.05 * product.getPriceNet();
                return roundGrossPrice(grossPrice);

            case "B":
                grossPrice = 1.08 * product.getPriceNet();
                return roundGrossPrice(grossPrice);

            case "C":
                grossPrice = 1.23 * product.getPriceNet();
                return roundGrossPrice(grossPrice);

            default:
                grossPrice = product.getPriceNet();
        }
        return grossPrice;
    }

    public double roundGrossPrice(double grossPrice) {
        grossPrice *= 100;
        grossPrice = Math.round(grossPrice);
        grossPrice /= 100;

        return grossPrice;
    }
}