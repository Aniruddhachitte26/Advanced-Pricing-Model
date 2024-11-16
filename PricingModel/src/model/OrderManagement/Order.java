/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrderManagement;

import java.util.ArrayList;
import model.CustomerManagement.CustomerProfile;
import model.MarketModel.MarketChannelAssignment;
import model.ProductManagement.Product;
import model.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */
public class Order {
    
    private static int idCounter = 0; // Static counter to generate unique IDs
    private int orderId; // Unique identifier for each order
    ArrayList<OrderItem> orderitems;
    CustomerProfile customer;
    SalesPersonProfile salesperson;
    MarketChannelAssignment mca;
    String status;

    public Order(CustomerProfile cp) {
        this(cp, null);
    }
    
    public Order(CustomerProfile cp, SalesPersonProfile sp) {
        orderitems = new ArrayList();
        this.orderId = generateUniqueID(); // Generate unique ID for the order
        this.orderitems = new ArrayList<>();
        this.customer = cp;
        this.salesperson = sp;
        this.status = "Closed"; // Default status
        if (cp != null) {
            cp.addCustomerOrder(this); // Link the order to the customer
        }
        if (sp != null) {
            sp.addSalesOrder(this); // Link the order to the salesperson
        }
    }
    
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderitems.add(oi);
        return oi;
    }
    
    public int getOrderId() {
        return orderId;
    }
    private synchronized static int generateUniqueID() {
        return ++idCounter;
    }
    //order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

     public String getStatus() {
        return status;
    }

     
    public CustomerProfile getCustomer() {
    return this.customer;
}  
     
    public void setStatus(String status) {
        this.status = status;
    }
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    //sum all the item targets and compare to the total of the order 
    public boolean isOrderAboveTotalTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
        }
        if(getOrderTotal()>sum) {return true;}
        else {return false;}
        
    }
public void CancelOrder(){
    status = "Cancelled";
}
public void Submit(){
    status = "Submitted";
}
}
