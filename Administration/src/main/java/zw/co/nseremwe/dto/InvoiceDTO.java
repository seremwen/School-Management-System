package zw.co.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDTO extends BaseEntityDTO{

    private Date invoiceDate;
    private BigDecimal totalAmount;
    private Long studentId;
    private List<Long> feeIds;
    private List<Long> paymentIds;
}
