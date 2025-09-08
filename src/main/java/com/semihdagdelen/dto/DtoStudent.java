package com.semihdagdelen.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//GET işlemi için bu dto kullanılacak.
public class DtoStudent {

    private String firstName;
    private String lastName;
}
