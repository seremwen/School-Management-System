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
public class SubjectRequest {
    @NotNull(message = "Subject name is required")
    private String name;

    private String description;

    @NotNull(message = "Class ID is required")
    private Long classId;
}
