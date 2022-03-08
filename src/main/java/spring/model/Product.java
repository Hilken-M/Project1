package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;
    @Column
    private String productName;
    @Column
    private double price;
