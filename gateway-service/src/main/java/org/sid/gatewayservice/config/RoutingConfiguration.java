package org.sid.gatewayservice.config;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfiguration {

//    @Bean
//    RouteLocator staticRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/api/v1/customer/**")
//                        .filters(f -> f.rewritePath("/api/v1/customer/(?<remains>.*)", "/${remains}")
//                                .hystrix(c -> c.setName("hystrix")
//                                        .setFallbackUri("forward:/defaultCustomers")))
//                        .uri("lb://CUSTOMER-SERVICE/")
//                        .id("customer-service"))
//                .route(r -> r.path("/products/**")
//                        .filters(f -> f
//                                .hystrix(h -> h.setName("products").setFallbackUri("forward:/defaultProducts")))
//                        .uri("lb://INVENTORY-SERVICE").id("r2"))
//                .build();
//    }


    @Bean
    DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {
        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
    }
}
