package com.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Entity
public class Order {
    @Id
    private int orderId;
    private int tableNumber;
    private int Quantity;
    private String orderStatus;

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @OneToMany(mappedBy ="order")
    private List<MenuCard> orderList;
    @ManyToOne
    @JoinColumn(name = "customer_customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "menu_card_menu_id")
    private MenuCard menuCard;

    public MenuCard getMenuCard() {
        return menuCard;
    }

    public void setMenuCard(MenuCard menuCard) {
        this.menuCard = menuCard;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderId() {
        Random random=new Random();
        orderId= random.nextInt();

        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public List<MenuCard> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<MenuCard> orderList) {
        this.orderList = orderList;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", tableNumber=" + tableNumber +
                ", Quantity=" + Quantity +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderList=" + orderList +
                ", customer=" + customer +
                ", menuCard=" + menuCard +
                '}';
    }
}
