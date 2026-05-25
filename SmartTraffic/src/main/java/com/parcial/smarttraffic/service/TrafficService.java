package com.parcial.smarttraffic.service;

import com.parcial.smarttraffic.algorithm.GraphAlgorithms;
import com.parcial.smarttraffic.model.Ciudad;
import com.parcial.smarttraffic.model.Ruta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

@Service
public class TrafficService {

    private final List<Ciudad> ciudades = new ArrayList<>();
    private final List<Ruta> rutas = new ArrayList<>();
    private final Map<String, List<String>> grafo = new HashMap<>();
    private final Stack<String> historialConsultas = new Stack<>();

    public TrafficService() {
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        ciudades.add(new Ciudad("Centro", 65));
        ciudades.add(new Ciudad("Norte", 40));
        ciudades.add(new Ciudad("Sur", 80));
        ciudades.add(new Ciudad("Este", 55));
        ciudades.add(new Ciudad("Oeste", 70));
        ciudades.add(new Ciudad("Aeropuerto", 35));

        agregarRuta("Centro", "Norte", 8, 12);
        agregarRuta("Centro", "Sur", 10, 18);
        agregarRuta("Norte", "Este", 6, 9);
        agregarRuta("Sur", "Oeste", 7, 14);
        agregarRuta("Este", "Aeropuerto", 12, 20);
        agregarRuta("Oeste", "Aeropuerto", 15, 25);
        agregarRuta("Norte", "Oeste", 9, 16);
    }

    private void agregarRuta(String origen, String destino, int distancia, int tiempoEstimado) {
        rutas.add(new Ruta(origen, destino, distancia, tiempoEstimado));

        grafo.putIfAbsent(origen, new ArrayList<>());
        grafo.putIfAbsent(destino, new ArrayList<>());

        grafo.get(origen).add(destino);
        grafo.get(destino).add(origen);
    }

    public List<Ciudad> obtenerCiudades() {
        return ciudades;
    }

    public List<Ruta> obtenerRutas() {
        return rutas;
    }

    public Map<String, List<String>> obtenerGrafo() {
        return grafo;
    }

    public List<String> ejecutarBfs(String inicio) {
        historialConsultas.push("BFS ejecutado desde: " + inicio);
        return GraphAlgorithms.bfs(grafo, inicio);
    }

    public List<String> ejecutarDfs(String inicio) {
        historialConsultas.push("DFS ejecutado desde: " + inicio);
        return GraphAlgorithms.dfs(grafo, inicio);
    }

    public Stack<String> obtenerHistorialConsultas() {
        return historialConsultas;
    }
}
