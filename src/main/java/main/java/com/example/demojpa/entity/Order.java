package main.java.com.example.demojpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "TABLE_ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderName;

    @ManyToMany(mappedBy = "orders")
//    @JoinTable(name = "PRODUCT_ORDER",
//            joinColumns = @JoinColumn(name = "order_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;
}
