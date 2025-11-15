package com.demo.user;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User {
private String username;
private String password;
private String email;
private String status;

}
