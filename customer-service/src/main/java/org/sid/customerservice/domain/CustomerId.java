package org.sid.customerservice.domain;

import org.axonframework.common.Assert;
import org.axonframework.domain.IdentifierFactory;

import java.io.Serializable;

public class CustomerId implements Serializable {

    private static final long serialVersionUID = -2521069615900157076L;
    private final String identifier;
    private final int hashCode;

    public CustomerId() {
        this.identifier = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = identifier.hashCode();
    }

    public CustomerId(String identifier) {
        Assert.notNull(identifier, "Identifier may not be null");
        this.identifier = identifier;
        this.hashCode = identifier.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        org.sid.customerservice.domain.CustomerId customerId = (org.sid.customerservice.domain.CustomerId) o;

        return identifier.equals(customerId.identifier);

    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
