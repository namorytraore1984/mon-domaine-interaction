package com.next.technologies.mondomaineinteraction.api.v1.controllers;

import com.next.technologies.mondomaineinteraction.dtos.HealtyObject;
import com.next.technologies.mondomaineinteraction.servives.MonDomaineHealtySrv;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path = {"service/interaction/mon-domaine"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class MonDomaineHealtyCtrl {

    private final MonDomaineHealtySrv healtySrv;

    @GetMapping("/sante")
    public HealtyObject sanityCheck() {
        return healtySrv.getAllServicesHealtyMsg();
    }
}
