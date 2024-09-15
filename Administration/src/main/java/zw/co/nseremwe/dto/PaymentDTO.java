package zw.co.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO extends BaseEntityDTO {
    private BigDecimal amount;
    private Date paymentDate;
    private Long studentId;
    private Long feeId;
    private String paymentMethod;

}