package app.moz.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private long id;

    private String email;

    private String name;

    private String password;

    private String firstName;

    private String lastName;

}
