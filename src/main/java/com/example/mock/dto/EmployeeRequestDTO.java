package com.example.mock.dto;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDTO {

    private UUID leagueGuid;
    private boolean activeFlg;
    private String surname;
    private String name;
    private String middleName;
    private String email;
    private String phone;

}
