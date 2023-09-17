package com.example.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PracticeRequestDTO {

    private UUID leagueGuid;
    private UUID externalId1c;
    private String name;
    private List<AssistantRequestDTO> assistants;

}
