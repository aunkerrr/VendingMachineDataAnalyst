package exceptionsHandler;

import java.time.LocalDateTime;

public class InvalidSaleException extends Exception {
    public InvalidSaleException(String message) {
        super(message);
    }

    public record Sale(LocalDateTime timeStamp, String slot, String productName, double price, String paymentMethod) {}
}