package zw.co.nseremwe.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "subjects")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject extends BaseEntity{


    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    @ManyToMany(mappedBy = "subjects")
    private List<SchoolClass> schoolClasses;


}