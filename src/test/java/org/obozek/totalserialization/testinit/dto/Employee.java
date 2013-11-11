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
public class Employee implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Integer employeenumber;
    private String lastname;
    private String firstname;
    private String extension;
    private String email;
    private String officecode;
    private Integer reportsto;
    private String jobtitle;

    public Employee()
    {
    }

    public Employee(Integer employeenumber)
    {
        this.employeenumber = employeenumber;
    }

    public Integer getEmployeenumber()
    {
        return employeenumber;
    }

    public void setEmployeenumber(Integer employeenumber)
    {
        this.employeenumber = employeenumber;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getExtension()
    {
        return extension;
    }

    public void setExtension(String extension)
    {
        this.extension = extension;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getOfficecode()
    {
        return officecode;
    }

    public void setOfficecode(String officecode)
    {
        this.officecode = officecode;
    }

    public Integer getReportsto()
    {
        return reportsto;
    }

    public void setReportsto(Integer reportsto)
    {
        this.reportsto = reportsto;
    }

    public String getJobtitle()
    {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle)
    {
        this.jobtitle = jobtitle;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (employeenumber != null ? employeenumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeenumber == null && other.employeenumber != null) || (this.employeenumber != null && !this.employeenumber.equals(other.employeenumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "employeenumber=" + employeenumber + ", lastname="
                + lastname + ", firstname=" + firstname + ", email=" + email + '}';
    }
}
