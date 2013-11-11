/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obozek.totalserialization.testinit.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author infragile
 */
public class Payment implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected PaymentPK paymentPK;
    private Date paymentDate;
    private Double amount;
    private Customer customer;

    public Payment()
    {
    }

    public Payment(PaymentPK paymentsPK)
    {
        this.paymentPK = paymentsPK;
    }

    public Payment(int customernumber, String checknumber)
    {
        this.paymentPK = new PaymentPK(customernumber, checknumber);
    }

    public PaymentPK getPaymentPK()
    {
        return paymentPK;
    }

    public void setPaymentPK(PaymentPK paymentPK)
    {
        this.paymentPK = paymentPK;
    }

    public Date getPaymentDate()
    {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate)
    {
        this.paymentDate = paymentDate;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Double getAmount()
    {
        return amount;
    }

    public void setAmount(Double amount)
    {
        this.amount = amount;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (paymentPK != null ? paymentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentPK == null && other.paymentPK != null) || (this.paymentPK != null && !this.paymentPK.equals(other.paymentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Payment{" + "paymentPK=" + paymentPK + ", paymentDate="
                + paymentDate + ", amount=" + amount + '}';
    }
}
