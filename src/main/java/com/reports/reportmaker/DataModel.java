package com.reports.reportmaker;

/**
 * Data model after validation - ready to write to the database
 */
class DataModel {

    private String clientID;
    private long requestID;
    private String name;
    private int quantity;
    private double price;

    /**
     * Constructor
     *
     * @param clientID  client ID (String - no spaces and no more than 6 chars)
     * @param requestID request ID (long)
     * @param name      name of client (String - no longer than 255 chars)
     * @param quantity  quantity of product (int)
     * @param price     price of product (double)
     */
    DataModel(String clientID, long requestID, String name, int quantity, double price) {
        this.clientID = clientID;
        this.requestID = requestID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * @return clinet ID
     */
    String getClientID() {
        return clientID;
    }

    /**
     * @return request ID
     */
    long getRequestID() {
        return requestID;
    }

    /**
     * @return name od client
     */
    String getName() {
        return name;
    }

    /**
     * @return quantity of product
     */
    int getQuantity() {
        return quantity;
    }

    /**
     * @return price of product
     */
    double getPrice() {
        return price;
    }

}
