/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obozek.totalserialization.testinit.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author infragile
 */
public class Customer implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Integer customerNumber;
    private String customerName;
    private String contactLastname;
    private String contactFirstname;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Integer salesRepEmployeeNumber;
    private Double creditLimit;
    private List<Payment> paymentList;
    private List<Order> orderList;

    public Customer()
    {
    }

    public Customer(Integer customernumber)
    {
        this.customerNumber = customernumber;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Integer getCustomerNumber()
    {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getContactLastname()
    {
        return contactLastname;
    }

    public void setContactLastname(String contactLastname)
    {
        this.contactLastname = contactLastname;
    }

    public String getContactFirstname()
    {
        return contactFirstname;
    }

    public void setContactFirstname(String contactFirstname)
    {
        this.contactFirstname = contactFirstname;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1)
    {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2)
    {
        this.addressLine2 = addressLine2;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public Integer getSalesRepEmployeeNumber()
    {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber)
    {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public Double getCreditLimit()
    {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit)
    {
        this.creditLimit = creditLimit;
    }

    public List<Payment> getPaymentList()
    {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList)
    {
        this.paymentList = paymentList;
    }

    public List<Order> getOrderList()
    {
        return orderList;
    }

    public void setOrderList(List<Order> orderList)
    {
        this.orderList = orderList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (customerNumber != null ? customerNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerNumber == null && other.customerNumber != null) || (this.customerNumber != null && !this.customerNumber.equals(other.customerNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "customerNumber=" + customerNumber
                + ", customerName=" + customerName + ", contactLastname="
                + contactLastname + ", contactFirstname=" + contactFirstname + '}';
    }
}
