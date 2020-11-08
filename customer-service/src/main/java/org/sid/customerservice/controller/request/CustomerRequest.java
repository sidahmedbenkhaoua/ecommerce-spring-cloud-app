package org.sid.customerservice.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.customerservice.domain.CustomerId;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private CustomerId customerId;
    private String name;
    private String email;

}

