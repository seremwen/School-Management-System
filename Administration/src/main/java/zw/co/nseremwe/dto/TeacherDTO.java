package zw.co.nseremwe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO extends BaseEntityDTO{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
