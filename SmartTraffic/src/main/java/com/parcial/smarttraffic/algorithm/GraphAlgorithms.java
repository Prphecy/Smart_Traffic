package com.parcial.smarttraffic.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphAlgorithms {

    public static List<String> bfs(Map<String, List<String>> grafo, String inicio) {
        List<String> recorrido = new ArrayList<>();
        Queue<String> cola = new LinkedList<>();
        Set<String> visitados = new HashSet<>();

        cola.add(inicio);
        visitados.add(inicio);

        while (!cola.isEmpty()) {
            String ciudadActual = cola.poll();
            recorrido.add(ciudadActual);

            List<String> vecinos = grafo.getOrDefault(ciudadActual, new ArrayList<>());

            for (String vecino : vecinos) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }

        return recorrido;
    }

    public static List<String> dfs(Map<String, List<String>> grafo, String inicio) {
        List<String> recorrido = new ArrayList<>();
        Set<String> visitados = new HashSet<>();

        dfsRecursivo(grafo, inicio, visitados, recorrido);

        return recorrido;
    }

    private static void dfsRecursivo(
            Map<String, List<String>> grafo,
            String ciudadActual,
            Set<String> visitados,
            List<String> recorrido
    ) {
        visitados.add(ciudadActual);
        recorrido.add(ciudadActual);

        List<String> vecinos = grafo.getOrDefault(ciudadActual, new ArrayList<>());

        for (String vecino : vecinos) {
            if (!visitados.contains(vecino)) {
                dfsRecursivo(grafo, vecino, visitados, recorrido);
            }
        }
    }
}