package com.systemdecommande.systemdecommande.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity(name = "delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "delivery_man")
    private String deliveryMan;
    private Date shoppingDate;
    private Date deliveryDate;
    @ManyToOne(
            optional = false,
            cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private Order order;
}
