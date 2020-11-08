package org.sid.billingservice.controller.views;

import org.sid.billingservice.model.Bill;
import org.sid.billingservice.model.ProductItem;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(name = "fullBill", types = Bill.class)
public interface BillProjection {

    public Long getId();

    public Date getBillingDate();

    public Long getCustomerId();

    public Collection<ProductItem> getProductItems();
}
