package zw.co.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FeeDTO extends BaseEntityDTO {

    private String description;
    private BigDecimal amount;
    private Long studentId;
    private Long classId;

    // Getters and setters
}