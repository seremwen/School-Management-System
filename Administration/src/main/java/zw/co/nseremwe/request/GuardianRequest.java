package zw.co.nseremwe.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GuardianRequest {
    @NotNull(message = "First name is required")
    private String firstName;

    @NotNull(message = "Last name is required")
    private String lastName;

    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Phone number is required")
    private String phoneNumber;

    @NotNull(message = "Address is required")
    private String address;

}
