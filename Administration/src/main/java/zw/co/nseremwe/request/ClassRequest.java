package zw.co.nseremwe.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ClassRequest {
    @NotNull(message = "Class name is required")
    private String name;

    @NotNull(message = "Teacher ID is required")
    private Long teacherId;

    private String description;
}
