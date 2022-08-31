package com.example.user.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.UniqueConstraint;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

    private String email; // Elektrin pochtasi

    private String first_name; // Ismi

    private String mid_name; // familyasi

    private String gd; // jinsi erkak/ayol

    private String natn; // millati

    private String userName;
}
