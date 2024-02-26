package market.services;

import market.models.Order;

public abstract class BaseService {
    public abstract void printInfo();

    public static long sumOrderPrices(Order... order) {
        long sum = 0;
        for (Order value : order) {
            sum += value.getOrderPrice();
        }
        return sum;
    }

    public static long tiyinToSum(long tiyin) {
        return tiyin / 100;
    }

}
