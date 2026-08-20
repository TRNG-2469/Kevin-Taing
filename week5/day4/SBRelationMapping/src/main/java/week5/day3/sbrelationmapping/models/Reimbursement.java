package week5.day3.sbrelationmapping.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reimbursement_id")
    int reimbursementId;
    int amount;
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    Employee ownerId;
}
