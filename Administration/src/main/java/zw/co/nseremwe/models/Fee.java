package zw.co.nseremwe.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;


import java.math.BigDecimal;
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fees")
public class Fee extends BaseEntity{

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private SchoolClass schoolClass;

}
