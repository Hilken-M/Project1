package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Inventory")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Inventory {

        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int productId;
        @Column
        private int quantity;
        @Column
        private int storeId;
}
