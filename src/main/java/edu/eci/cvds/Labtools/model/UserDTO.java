package edu.eci.cvds.Labtools.model;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String email;
    private String password;
    private boolean logged;
}
