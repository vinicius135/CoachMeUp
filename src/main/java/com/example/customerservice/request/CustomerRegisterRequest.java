package com.example.customerservice.request;

import com.example.customerservice.enums.CustomerRole;
import com.example.customerservice.enums.Flat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRegisterRequest {
    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Pattern(regexp = "^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})[A-Za-z0-9!~<>,;:_=?*+#.”&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]{8,32}$",
    message = "A senha exige de 4 a 32 caracteres, Letras maiusculas e minusculas, numeros e caracteres especiais.")
    private String password;
    @NotNull
//    @Pattern(regexp = "^\\d{8}\\d{1}$")
    private long NIF;
    @NotNull
    @Pattern(regexp = "\\(?\\+[0-9]{1,3}\\)? ?-?[0-9]{1,3} ?-?[0-9]{3,5} ?-?[0-9]{4}( ?-?[0-9]{3})?"
            , message = "enter a valid cell phone number")
    private String phone;
    @NotNull
    private DataAddress address;
    @NotNull
    private Flat flat;
    @NotNull
    private CustomerRole role;

}
