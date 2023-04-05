package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private Status paymentStatus;
    // @OneToOne(cascade = CascadeType.ALL) // same action will happen into the associated entity. payment <=> payment details // never use that
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}) // persist = save, usually use this, child saved and does not affect from changes, parent affected from changes like delete method
    // @JoinColumn(name = "payment_detail_id") change the name of foreign key, but optional since already provided automatically
    private PaymentDetail paymentDetail;

    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
