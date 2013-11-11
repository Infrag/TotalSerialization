/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obozek.totalserialization.testinit.dto;

import java.io.Serializable;

/**
 *
 * @author infragile
 */
public class OrderDetail implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected OrderDetailPK orderDetailPK;
    private Integer quantityOrdered;
    private Double priceEach;
    private Short orderlineNumber;
    private Product product;
    private Order order;

    public OrderDetail()
    {
    }

    public OrderDetail(OrderDetailPK orderdetailsPK)
    {
        this.orderDetailPK = orderdetailsPK;
    }

    public OrderDetail(int ordernumber, String productcode)
    {
        this.orderDetailPK = new OrderDetailPK(ordernumber, productcode);
    }

    public OrderDetailPK getOrderDetailPK()
    {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK)
    {
        this.orderDetailPK = orderDetailPK;
    }

    public Integer getQuantityOrdered()
    {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered)
    {
        this.quantityOrdered = quantityOrdered;
    }

    public Double getPriceEach()
    {
        return priceEach;
    }

    public void setPriceEach(Double priceEach)
    {
        this.priceEach = priceEach;
    }

    public Short getOrderlineNumber()
    {
        return orderlineNumber;
    }

    public void setOrderlineNumber(Short orderlineNumber)
    {
        this.orderlineNumber = orderlineNumber;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    public Order getOrder()
    {
        return order;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (orderDetailPK != null ? orderDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetail)) {
            return false;
        }
        OrderDetail other = (OrderDetail) object;
        if ((this.orderDetailPK == null && other.orderDetailPK != null) || (this.orderDetailPK != null && !this.orderDetailPK.equals(other.orderDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "OrderDetail{" + "orderDetailPK=" + orderDetailPK
                + ", quantityOrdered=" + quantityOrdered + ", priceEach="
                + priceEach + ", orderlineNumber=" + orderlineNumber + '}';
    }
}
