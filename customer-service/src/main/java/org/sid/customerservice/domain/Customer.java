package org.sid.customerservice.domain;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.sid.customerservice.event.CustomerCreatedEvent;


public class Customer extends AbstractAnnotatedAggregateRoot {

    private static final long serialVersionUID = 8723320580782813954L;

    @AggregateIdentifier
    private CustomerId customerId;

    private String email;
    private String name;


    @SuppressWarnings("UnusedDeclaration")
    protected Customer() {
    }

    public Customer(CustomerId customerId, String name, String email) {
        apply(new CustomerCreatedEvent(customerId, name, email));
    }

    @Override
    public CustomerId getIdentifier() {
        return this.customerId;
    }

    @EventHandler
    public void handle(CustomerCreatedEvent event) {
        this.customerId = event.getCustomerId();
        this.name = event.getName();
        this.email = event.getEmail();
    }

}
