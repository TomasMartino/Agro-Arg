package Agro_Arg.Agro_Arg.auth.controllers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    String username;
    String password;
    String firstname;
    String lastname;
    String country;
}