package com.example.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkingConditionsRequestDTO {

    private UUID legalEntityId;
    private UUID user1cGuid;
    private UUID officeGuid;
    private UUID practiceGuid;
    private String position;
    private String rate;
    private String employmentType;
    private LocalDate hireDate;
    private LocalDate fireDate;
    private Boolean isWorkStatus;

}
