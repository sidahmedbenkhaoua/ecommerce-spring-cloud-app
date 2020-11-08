package org.sid.customerservice.service;


import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.sid.customerservice.command.CreateCustomerCommand;
import org.sid.customerservice.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerCommandHandler {

    private EventSourcingRepository<Customer> customerRepository;

    @CommandHandler
    public void handle(CreateCustomerCommand command) {
        Customer customer = new Customer(
                command.getCustomerId(),
                command.getName(), command.getEmail());
        customerRepository.add(customer);
    }


    @Autowired
    public void setRepository(EventSourcingRepository<Customer> customerRepository) {
        this.customerRepository = customerRepository;
    }
}
