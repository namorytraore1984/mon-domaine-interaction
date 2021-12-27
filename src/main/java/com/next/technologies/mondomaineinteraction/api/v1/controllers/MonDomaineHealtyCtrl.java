package com.next.technologies.mondomaineinteraction.api.v1.controllers;

import com.next.technologies.mondomaineinteraction.dtos.HealtyObject;
import com.next.technologies.mondomaineinteraction.servives.MonDomaineHealtySrv;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"service/interaction/mon-domaine"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MonDomaineHealtyCtrl {

    private final MonDomaineHealtySrv healtySrv;

    @GetMapping("/sante")
    public HealtyObject sanityCheck() {
        return healtySrv.getAllServicesHealtyMsg();
    }

    @GetMapping("/sante1")
    public HealtyObject sanityCheck1() {
        return healtySrv.getAllServicesHealtyMsg1();
    }

    @GetMapping("/sante2")
    public HealtyObject sanityCheck2() {
        return HealtyObject.builder().serviceInteraction("OK").build();
    }

    @GetMapping("/sante3")
    public HealtyObject sanityCheck3() {
        return healtySrv.getAllServicesHealtyMsg3();
    }
}
