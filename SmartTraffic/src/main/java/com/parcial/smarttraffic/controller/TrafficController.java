package com.parcial.smarttraffic.controller;

import com.parcial.smarttraffic.service.TrafficService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrafficController {

    private final TrafficService trafficService;

    public TrafficController(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    @GetMapping("/mapa")
    public String verMapa(Model model) {
        model.addAttribute("ciudades", trafficService.obtenerCiudades());
        model.addAttribute("rutas", trafficService.obtenerRutas());
        model.addAttribute("grafo", trafficService.obtenerGrafo());
        return "mapa";
    }

    @GetMapping("/algoritmos")
    public String verAlgoritmos(Model model) {
        model.addAttribute("bfs", trafficService.ejecutarBfs("Centro"));
        model.addAttribute("dfs", trafficService.ejecutarDfs("Centro"));
        model.addAttribute("historial", trafficService.obtenerHistorialConsultas());
        return "algoritmos";
    }
}
