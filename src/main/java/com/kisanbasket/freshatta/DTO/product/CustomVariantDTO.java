package com.kisanbasket.freshatta.DTO.product;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomVariantDTO {

    private Long id;

    @NotNull(message = "Grain Combo ID is required")
    private Long grainComboId;

    @NotNull(message = "Product Variant ID is required")
    private Long productVariantId;
}
