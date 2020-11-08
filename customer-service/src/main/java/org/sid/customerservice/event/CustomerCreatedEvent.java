package org.sid.customerservice.event;


import org.sid.customerservice.domain.CustomerId;


public class CustomerCreatedEvent {
    private CustomerId customerId;

    private String name;
    private String email;


    public CustomerCreatedEvent(CustomerId customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;

    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerId customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
