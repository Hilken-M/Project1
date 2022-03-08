package spring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Ledger")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Ledger {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    @Column
    private int employeeId;
    @Column
    private int productId;
    @Column
    private int storeId;
    @Column
    private double quantityChange;
//    @Column
//    private int timestamp;

}
