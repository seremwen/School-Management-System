package zw.co.nseremwe.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceRequest {

    @NotNull(message = "Invoice date is required")
    private Date invoiceDate;

    @NotNull(message = "Total amount is required")
    private BigDecimal totalAmount;

    @NotNull(message = "Student ID is required")
    private Long studentId;

    @NotNull(message = "Fee IDs are required")
    private List<Long> feeIds;

    @NotNull(message = "Payment IDs are required")
    private List<Long> paymentIds;
}
