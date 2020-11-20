package com.company;

public class Invoice implements Payable {

    private String partNumber;
    private String partDescription;
    private int quantity;



    private double pricePerItem;

    public Invoice(String part, String description, int count, double price){

        partNumber=part;
        partDescription=description;
        setQantity(count);
        setPriceItem(price);

    }

    public void setPartNumber(String part){
        partNumber=part;
    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description){
        partDescription=description;
    }
    public String getPartDescription(){
        return  partDescription;
    }
    public void setQantity(int count){
        quantity=count;
    }
    public int getQuantity(){
        return  quantity;
    }
    public void setPriceItem(double price){
        if(price>0){
            pricePerItem=price;
        }else pricePerItem=0.0;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }
    public double getPaymentAmount(){
        return getQuantity()*getPricePerItem();
    }

}
