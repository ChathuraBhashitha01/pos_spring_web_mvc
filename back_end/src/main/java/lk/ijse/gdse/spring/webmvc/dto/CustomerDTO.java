package lk.ijse.gdse.spring.webmvc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    @NotBlank(message = "id can not be null")
    private String id;
    @NotBlank(message = "name can not be null")
    @Pattern(regexp = "[A-Za-z ]+", message = "name is not valid")
    private String name;
    @NotBlank(message = "address can not be null")
    private String address;
    @NotBlank(message = "salary can not be null")
    private double salary;
}
