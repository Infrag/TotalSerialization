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
public class PaymentPK implements Serializable
{

    private int customerNumber;
    private String checkNumber;

    public PaymentPK()
    {
    }

    public PaymentPK(int customernumber, String checknumber)
    {
        this.customerNumber = customernumber;
        this.checkNumber = checknumber;
    }

    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber()
    {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber)
    {
        this.checkNumber = checkNumber;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (int) customerNumber;
        hash += (checkNumber != null ? checkNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentPK)) {
            return false;
        }
        PaymentPK other = (PaymentPK) object;
        if (this.customerNumber != other.customerNumber) {
            return false;
        }
        if ((this.checkNumber == null && other.checkNumber != null) || (this.checkNumber != null && !this.checkNumber.equals(other.checkNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "PaymentPK{" + "customerNumber=" + customerNumber
                + ", checkNumber=" + checkNumber + '}';
    }
}
