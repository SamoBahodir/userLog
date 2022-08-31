package com.example.user.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.intellij.lang.annotations.JdkConstants;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "foydalanuvchi")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email; // Elektrin pochtasi

    private String first_name; // Ismi

    private String mid_name; // familyasi

    private String gd; // jinsi erkak/ayol

    private String natn; // millati

    @Column(name = "user_name", unique = true)
    private String userName;
}
