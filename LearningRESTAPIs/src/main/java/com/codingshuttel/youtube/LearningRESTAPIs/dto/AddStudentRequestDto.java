package com.codingshuttel.youtube.LearningRESTAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentRequestDto {
    @NotBlank(message = "Name is Required")
    @Size(min=3,max = 20,message = "name size should be required 3 to 20 characters")
    private String name;
    @Email
    @NotBlank(message = "Email is Required")
    private String email;
}
