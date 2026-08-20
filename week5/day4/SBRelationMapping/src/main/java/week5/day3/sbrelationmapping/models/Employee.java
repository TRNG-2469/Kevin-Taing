package week5.day3.sbrelationmapping.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    int employee_id;
    String name;

    @OneToMany(mappedBy = "ownerId", cascade = CascadeType.ALL)
    List<Reimbursement> reimbursementList = new ArrayList<>();
}
