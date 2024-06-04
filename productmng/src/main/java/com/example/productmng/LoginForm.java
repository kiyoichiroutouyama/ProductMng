package com.example.productmng;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class LoginForm {
    @NotEmpty(message = "IDは必須です")
    @Length(max = 20)
    public String loginId;
    @NotEmpty(message = "PASSは必須です")
    @Length(max = 50)
    public String password;

}
