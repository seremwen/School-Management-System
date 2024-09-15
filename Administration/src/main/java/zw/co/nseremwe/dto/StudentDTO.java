package zw.co.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO extends BaseEntityDTO {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date enrollmentDate;
    private String address;
    private String email;
    private String phoneNumber;
    private Long classId;
    private Long guardianId;
    private List<Long> feeIds;
    private List<Long> paymentIds;
    private List<Long> invoiceIds;
}
