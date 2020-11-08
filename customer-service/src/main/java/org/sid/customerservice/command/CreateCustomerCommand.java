package org.sid.customerservice.command;

import org.sid.customerservice.domain.CustomerId;

public class CreateCustomerCommand {

    private CustomerId customerId;
    private String name;
    private String email;

    public CreateCustomerCommand(CustomerId customerId, String name, String email) {
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
