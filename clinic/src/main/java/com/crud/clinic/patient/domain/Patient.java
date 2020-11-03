package com.crud.clinic.patient.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Patient {
    private Long patientId;
    private String patientName;
    private String patientSurname;
    private int patientAge;
}
