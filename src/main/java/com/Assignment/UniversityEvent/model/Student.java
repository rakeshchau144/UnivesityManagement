package com.Assignment.UniversityEvent.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    private Long studentId;

    @Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First name should start with a capital letter")
    private String firstName;
    private String lastName;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 25, message = "Age should not be greater than 25")
    private Integer age;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type department;

    // Constructors, getters, and setters
}
