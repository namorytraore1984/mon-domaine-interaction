package com.next.technologies.mondomaineinteraction.servives;

import static com.next.technologies.mondomaineinteraction.constantes.MonDomaineConst.HEALTHY_MSG;

import com.next.technologies.mondomaineinteraction.dtos.HealtyObject;
import org.springframework.boot.autoconfigure.web.client.RestTemplateBuilderConfigurer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class MonDomaineHealtySrv {

    public HealtyObject getAllServicesHealtyMsg() {

        RestTemplate restTemplate = new RestTemplate();

        HealtyObject srvMetierResp =  restTemplate.getForObject("http://localhost:9091/service/metier/mon-domaine/sante", HealtyObject.class);

        HealtyObject.HealtyObjectBuilder builder =  HealtyObject.builder().serviceInteraction(HEALTHY_MSG);

        Optional.ofNullable(srvMetierResp).ifPresent(resp -> {
            builder.serviceMetier(resp.getServiceMetier());
        });

        return builder.build();
    }

    public HealtyObject getAllServicesHealtyMsg1() {

        RestTemplate restTemplate = new RestTemplate();

        HealtyObject srvMetierResp =  restTemplate.getForObject("http://localhost:8081/service/metier/mon-domaine/sante", HealtyObject.class);

        HealtyObject.HealtyObjectBuilder builder =  HealtyObject.builder().serviceInteraction(HEALTHY_MSG);

        Optional.ofNullable(srvMetierResp).ifPresent(resp -> {
            builder.serviceMetier(resp.getServiceMetier());
        });

        return builder.build();
    }

    public HealtyObject getAllServicesHealtyMsg3() {

        RestTemplate restTemplate = new RestTemplate();

        HealtyObject srvMetierResp =  restTemplate.getForObject("http://producer:8081/service/metier/mon-domaine/sante", HealtyObject.class);

        HealtyObject.HealtyObjectBuilder builder =  HealtyObject.builder().serviceInteraction(HEALTHY_MSG);

        Optional.ofNullable(srvMetierResp).ifPresent(resp -> {
            builder.serviceMetier(resp.getServiceMetier());
        });

        return builder.build();
    }
}
