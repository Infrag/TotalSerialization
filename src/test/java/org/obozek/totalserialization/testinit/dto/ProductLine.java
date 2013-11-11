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
public class ProductLine implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String productLine;
    private String textDescription;
    private String htmlDescription;
    private Serializable image;

    public ProductLine()
    {
    }

    public ProductLine(String productline)
    {
        this.productLine = productline;
    }

    public String getProductLine()
    {
        return productLine;
    }

    public void setProductLine(String productLine)
    {
        this.productLine = productLine;
    }

    public String getTextDescription()
    {
        return textDescription;
    }

    public void setTextDescription(String textDescription)
    {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription()
    {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription)
    {
        this.htmlDescription = htmlDescription;
    }

    public Serializable getImage()
    {
        return image;
    }

    public void setImage(Serializable image)
    {
        this.image = image;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (productLine != null ? productLine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductLine)) {
            return false;
        }
        ProductLine other = (ProductLine) object;
        if ((this.productLine == null && other.productLine != null) || (this.productLine != null && !this.productLine.equals(other.productLine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ProductLine{" + "productLine=" + productLine + '}';
    }
}
