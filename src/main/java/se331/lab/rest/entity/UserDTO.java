package se331.lab.rest.entity;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    Long id;
    String username;
    String password;
    String email;
}
