package com.example.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfficeRequestDTO {

    private UUID leagueGuid;
    private UUID externalId1c;
    private UUID regionLeagueGuid;
    private UUID regionExternalId1c;
    private String officeName;
    private Boolean isActive;
    private String address;
    private String regionName;

}
