package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeStore")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class EmployeeStore {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column
    private int storeId;
}
