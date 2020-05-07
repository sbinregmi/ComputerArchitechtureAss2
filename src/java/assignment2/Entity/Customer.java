/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author prashant
 */
@Entity
@NamedQueries({
    @NamedQuery(name="findAll",query="select c from Customer c"),
    @NamedQuery(name="findByName", query="select c from Customer c where c.name=:cName")
})
public class Customer implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerID;
    private String name;
    private String address;
    private String phoneNo;
    private String email;
    
    @OneToMany
    private List<Order> customerOrders;

    public Customer() {
        
    }

    public Customer(Long customerID, String name, String address, String phoneNo, String email, List<Order> customerOrders) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
        this.customerOrders = customerOrders;
    }
        
    
    public Long getCustomerID() {
        return customerID;
    }

    

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<Order> customerOrders) {
        this.customerOrders = customerOrders;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }    

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", name=" + name + ", address=" + address + ", customerOrders=" + customerOrders + '}';
    }
}
