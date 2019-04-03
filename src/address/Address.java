/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author bijay
 */
public class Address {
    private int addressid;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
    
    public Address() {
		firstname = "";
                lastname="";
		phonenumber = "";
		email = "";
	}
    
    public void setAddressid(int addressid) {
    this.addressid = addressid;
    }

    public int getAddressid() {
        return this.addressid;
    }
    
    public void setFirstName(String fname) {
    this.firstname = fname;
    }

    public String getFirstName() {
        return this.firstname;
    }
    
    public void setLastName(String lname) {
    this.lastname = lname;
    }

    public String getLastName() {
        return this.lastname;
    }
    
    public void setPhoneNumber(String phonenumber) {
    this.phonenumber = phonenumber;
    }

    public String getPhoneNumber() {
        return this.phonenumber;
    }
    
    public void setEmail(String email) {
    this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    
}
