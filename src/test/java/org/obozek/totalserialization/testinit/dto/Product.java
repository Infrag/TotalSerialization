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
public class Product implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String code;
    private String name;
    private String productLine;
    private String scale;
    private String vendor;
    private String description;
    private Integer quantityInStock;
    private Double buyPrice;
    private Double msrp;
    private List<OrderDetail> orderDetailList;

    public Product()
    {
    }

    public Product(String productcode)
    {
        this.code = productcode;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProductLine()
    {
        return productLine;
    }

    public void setProductLine(String productLine)
    {
        this.productLine = productLine;
    }

    public String getScale()
    {
        return scale;
    }

    public void setScale(String scale)
    {
        this.scale = scale;
    }

    public String getVendor()
    {
        return vendor;
    }

    public void setVendor(String vendor)
    {
        this.vendor = vendor;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getQuantityInStock()
    {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock)
    {
        this.quantityInStock = quantityInStock;
    }

    public Double getBuyPrice()
    {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice)
    {
        this.buyPrice = buyPrice;
    }

    public List<OrderDetail> getOrderDetailList()
    {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList)
    {
        this.orderDetailList = orderDetailList;
    }

    public Double getMsrp()
    {
        return msrp;
    }

    public void setMsrp(Double msrp)
    {
        this.msrp = msrp;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Product{" + "code=" + code + ", name=" + name + ", productLine="
                + productLine + ", vendor=" + vendor + '}';
    }
}
