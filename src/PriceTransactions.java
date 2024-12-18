public class PriceTransactions {
    public static <T extends Car> double sumPrices(T car1,T car2) {
        return car1.getPrice() + car2.getPrice();
    }
}
