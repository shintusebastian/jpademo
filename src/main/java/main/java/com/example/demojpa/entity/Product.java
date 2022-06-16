package main.java.com.example.demojpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "TABLE_PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String category;

    //    @With
    private double price;
    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Order.class)
    @JoinTable(name = "PRODUCT_ORDER",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))

    private Set<Order> orders;
}
