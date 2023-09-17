package com.example.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {

    private UUID leagueGuid;
    private UUID externalId1c;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String login;
    private String email;
    private Boolean isActive;
    private String leaguePosition;
    private String firstHireDate;
    private String personnelStatus;
    private List<WorkingConditionsRequestDTO> workingConditions;

}
