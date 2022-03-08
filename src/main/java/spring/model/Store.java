package spring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Store")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Store {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;
    @Column
    private String storeName;
    @Column
    private String stateName;
    @Column
    private String cityName;
    @Column
    private String streetName;
    @Column
    private float addressNumber;
    @Column
    private double zipcode;
    @Column
    private float phoneNumber;
}
