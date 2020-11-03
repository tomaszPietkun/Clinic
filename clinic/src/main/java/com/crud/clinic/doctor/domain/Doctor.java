package com.crud.clinic.doctor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Doctor {
    private Long docId;
    private String docName;
    private String docSurname;
    private String docSpec;
}
