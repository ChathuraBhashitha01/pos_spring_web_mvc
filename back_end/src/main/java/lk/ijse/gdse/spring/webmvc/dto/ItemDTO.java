package lk.ijse.gdse.spring.webmvc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    @NotBlank(message = "id can not be null")
    private String code;
    @NotBlank(message = "description can not be null")
    @Pattern(regexp = "[A-Za-z ]+", message = "description is not valid")
    private String description;
    @NotBlank(message = "qtyOnHand can not be null")
    private int qtyOnHand;
    @NotBlank(message = "unitPrice can not be null")
    private double unitPrice;
}
