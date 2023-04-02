package com.example.restservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowId;
    private String firstName;
    private String lastName;
    private String middleName;
    @JsonIgnore
    private String login;
    @JsonIgnore
    private String password;
    @Nullable
    private Integer groupId;
    private Integer roleId;

}
