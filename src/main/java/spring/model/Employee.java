package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String stateName;
    @Column
    private String cityName;
    @Column
    private String streetName;
    @Column
    private int streetAddress;
    @Column
    private int zipcode;
    @Column
    private float phoneNumber;
    @Column
    private String emailAddress;

}
