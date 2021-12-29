package com.systemdecommande.systemdecommande.service;

import com.systemdecommande.systemdecommande.entity.Delivery;
import com.systemdecommande.systemdecommande.repo.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public String fastestDeliveryMan(){
        return deliveryRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(Delivery::getDeliveryMan))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        d -> d.getValue()
                                .stream()
                                .mapToLong(delivery -> delivery.getDeliveryDate().getTime() - delivery.getShoppingDate().getTime()
                                ).average().getAsDouble()))
                .entrySet()
                .stream()
                .max((o1, o2) -> o1.getValue() > o2.getValue() ?1:-1)
                .get().getKey();
    }
    public String slowestDeliveryMan(){
        return deliveryRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(Delivery::getDeliveryMan))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        d -> d.getValue()
                                .stream()
                                .mapToLong(delivery -> delivery.getDeliveryDate().getTime() - delivery.getShoppingDate().getTime()
                                ).average().getAsDouble()))
                .entrySet()
                .stream()
                .min((o1, o2) -> o1.getValue() > o2.getValue() ?1:-1)
                .get().getKey();
    }
}
