package com.semihdagdelen.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
//Insert Update (IU) işlemlerinde bu dto kullanılacak.
public class DtoStudentIU {

    private String firstName;
    private String lastName;
    private Date birthDate;
}
