package com.next.technologies.mondomaineinteraction.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HealtyObject {
    private String serviceInteraction;
    private String serviceMetier;
    private String serviceConfigServer;
    private String serviceDiscovery;
}
