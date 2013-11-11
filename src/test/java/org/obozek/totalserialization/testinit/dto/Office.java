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
public class Office implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String phone;
    private String officeCode;
    private String city;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private String postalCode;
    private String territory;

    public Office()
    {
    }

    public Office(String officecode)
    {
        this.officeCode = officecode;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
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

    public String getOfficeCode()
    {
        return officeCode;
    }

    public void setOfficeCode(String officeCode)
    {
        this.officeCode = officeCode;
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

    public String getTerritory()
    {
        return territory;
    }

    public void setTerritory(String territory)
    {
        this.territory = territory;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (officeCode != null ? officeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Office)) {
            return false;
        }
        Office other = (Office) object;
        if ((this.officeCode == null && other.officeCode != null) || (this.officeCode != null && !this.officeCode.equals(other.officeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Office{" + "phone=" + phone + ", city=" + city + '}';
    }
}
