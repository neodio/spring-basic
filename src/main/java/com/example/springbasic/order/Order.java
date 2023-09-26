package com.example.springbasic.order;

public class Order {

    private Long memberId;
    private String intemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String intemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.intemName = intemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getIntemName() {
        return intemName;
    }

    public void setIntemName(String intemName) {
        this.intemName = intemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", intemName='" + intemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
