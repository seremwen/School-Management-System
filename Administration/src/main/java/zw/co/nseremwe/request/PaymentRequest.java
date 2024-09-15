package zw.co.nseremwe.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
    @NotNull(message = "Amount is required")
    private BigDecimal amount;

    @NotNull(message = "Payment date is required")
    private Date paymentDate;

    @NotNull(message = "Student ID is required")
    private Long studentId;

    @NotNull(message = "Fee ID is required")
    private Long feeId;

    @NotNull(message = "Payment method is required")
    private String paymentMethod;

}
