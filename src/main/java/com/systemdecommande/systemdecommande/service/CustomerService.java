package com.systemdecommande.systemdecommande.service;

import com.systemdecommande.systemdecommande.entity.Customer;
import com.systemdecommande.systemdecommande.entity.OrderDetail;
import com.systemdecommande.systemdecommande.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> TopFiveClientsNbDelivery(){
        return customerRepository.findAll().stream()
                .sorted(Comparator.comparingInt(customer -> customer.getOrders().size()))
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<Customer> TopFiveClientsMoneySpent(){
         return customerRepository.findAll().stream()
                .collect(Collectors.toMap(customer -> customer,
                        customer -> customer.getOrders().stream()
                                .mapToDouble(order -> order.getOrderDetails().stream()
                                        .mapToDouble(OrderDetail::calculateTotal).sum())
                                .sum()
                ))
                 .entrySet()
                 .stream()
                 .sorted((o1, o2) -> (int)(o1.getValue() - o2.getValue()))
                 .limit(5)
                 .map(Map.Entry::getKey)
                 .collect(Collectors.toList());

    }

    public List<Customer> getCustomersWhoHadOrdersThatWeighedGreaterThan10kg(){
        return customerRepository.findAll().stream()
                .filter(customer ->
                        customer.getOrders().stream().anyMatch(order -> order.getOrderDetails().stream()
                                .map(OrderDetail::calculateWeight).findAny().isPresent())
                ).collect(Collectors.toList());
    }


}
