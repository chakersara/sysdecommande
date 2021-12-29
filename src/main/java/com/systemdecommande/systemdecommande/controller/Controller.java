package com.systemdecommande.systemdecommande.controller;

import com.systemdecommande.systemdecommande.entity.Customer;
import com.systemdecommande.systemdecommande.entity.Order;
import com.systemdecommande.systemdecommande.repo.CustomerRepository;
import com.systemdecommande.systemdecommande.repo.OrderRepository;
import com.systemdecommande.systemdecommande.service.CustomerService;
import com.systemdecommande.systemdecommande.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {
    private final CustomerService customerService;
    private final DeliveryService deliveryService;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    public Controller(CustomerService customerService, DeliveryService deliveryService) {
        this.customerService = customerService;
        this.deliveryService = deliveryService;
    }

    @GetMapping("TopFiveClientsMoneySpent")
    public List<Customer> TopFiveClientsMoneySpent(){
        return customerService.TopFiveClientsMoneySpent();
    }
    @GetMapping("TopFiveClientsNbDelivery")
    public List<Customer> TopFiveClientsNbDelivery(){
        return customerService.TopFiveClientsNbDelivery();
    }
    @GetMapping("getCustomersWhoHadOrdersThatWeighedGreaterThan10kg")
    public List<Customer> getCustomersWhoHadOrdersThatWeighedGreaterThan10kg(){
        return customerService.getCustomersWhoHadOrdersThatWeighedGreaterThan10kg();
    }
    @GetMapping("fastestDeliveryMan")
    public String fastestDeliveryMan(){
        return deliveryService.fastestDeliveryMan();
    }
    @GetMapping("slowestDeliveryMan")
    public String slowestDeliveryMan(){
        return deliveryService.slowestDeliveryMan();
    }
}
