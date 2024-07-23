package com.muse.books_world.auth;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {

    @NotEmpty(message = "firstname should not be empty")
    @NotBlank(message = "Email should not be empty")
    @Email(message = "Wrong email format")
    private String email;
    @NotEmpty(message = "Password should not be empty")
    @NotBlank(message = "Password should not be empty")
    @Size(message = "Password should be at least 8 characters")
    private String password;
}
