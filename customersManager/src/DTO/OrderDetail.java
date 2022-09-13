/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Bao
 */
public class OrderDetail {
    Order order;
    Item item;
    int quantity;

    public OrderDetail() {
        order=null;
        item=null;
        quantity=0;
    }

    public OrderDetail(Order order, Item item, int quantity) {
        this.order = order;
        this.item = item;
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void output(){
        System.out.println("ORDER DETAIL");
        if(order!=null && item!=null){
        order.outputOrder();
        item.outputItem();
        }
        else System.out.println("empty!");
     }
}
