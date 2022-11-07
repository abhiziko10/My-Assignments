package com.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class MenuCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int menuId;
 private String menuCuisine;
 private String dishName;
 private float dishPrice;
 @OneToMany(mappedBy ="menuCard")
 private List<Order> orderList;
   @ManyToOne
   @JoinColumn(name = "order_order_id")
   private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuCuisine() {
        return menuCuisine;
    }

    public void setMenuCuisine(String menuCuisine) {
        this.menuCuisine = menuCuisine;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public float getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(float dishPrice) {
        this.dishPrice = dishPrice;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "MenuCard{" +
                "menuId=" + menuId +
                ", menuCuisine='" + menuCuisine + '\'' +
                ", dishName='" + dishName + '\'' +
                ", dishPrice=" + dishPrice +
                ", orderList=" + orderList +
                '}';
    }
}
