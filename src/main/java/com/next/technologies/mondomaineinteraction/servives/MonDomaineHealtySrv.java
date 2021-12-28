package com.next.technologies.mondomaineinteraction.servives;

import com.next.technologies.mondomaineinteraction.dtos.HealtyObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static com.next.technologies.mondomaineinteraction.constantes.MonDomaineConst.HEALTHY_MSG;

@Service
public class MonDomaineHealtySrv {

    @Value("${app.clients.service-metier.url}")
    private String url;

    public HealtyObject getAllServicesHealtyMsg() {

        RestTemplate restTemplate = new RestTemplate();

        HealtyObject srvMetierResp = restTemplate.getForObject(url, HealtyObject.class);

        HealtyObject.HealtyObjectBuilder builder = HealtyObject.builder().serviceInteraction(HEALTHY_MSG);

        Optional.ofNullable(srvMetierResp).ifPresent(resp -> {
            builder.serviceMetier(resp.getServiceMetier());
        });

        return builder.build();
    }
}
