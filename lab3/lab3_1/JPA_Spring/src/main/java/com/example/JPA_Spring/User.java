package com.example.JPA_Spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="person")
public class User {
    


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotNull(message = "Phone is mandatory")
    private int phone;

    // standard constructors / setters / getters / toString

    public long getId() {return this.id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() { return this.email;}

    public void setEmail(String email) {this.email = email;}

    public int getPhone() {return this.phone;}

    public void setPhone(int phone) {this.phone = phone; }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            "}";
    }
}