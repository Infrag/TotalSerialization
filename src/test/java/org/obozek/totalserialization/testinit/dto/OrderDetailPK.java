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
public class OrderDetailPK implements Serializable
{

    private int orderNumber;
    private String productCode;

    public OrderDetailPK()
    {
    }

    public OrderDetailPK(int ordernumber, String productCode)
    {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
    }

    public int getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (int) orderNumber;
        hash += (productCode != null ? productCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailPK)) {
            return false;
        }
        OrderDetailPK other = (OrderDetailPK) object;
        if (this.orderNumber != other.orderNumber) {
            return false;
        }
        if ((this.productCode == null && other.productCode != null) || (this.productCode != null && !this.productCode.equals(other.productCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "OrderDetailPK{" + "orderNumber=" + orderNumber
                + ", productCode=" + productCode + '}';
    }
}
