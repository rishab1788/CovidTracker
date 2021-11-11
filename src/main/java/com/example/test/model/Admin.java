package com.example.test.model;

import javax.persistence.*;

/*Sample request - {"name":"X","phoneNumber":"9999999999","pinCode":"111111"}
Sample response - {"adminId": "2"}

*/
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String name;

    @Column(unique=true)
    String mobileNumber;

    String pinCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
