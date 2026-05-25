package com.parcial.smarttraffic.model;

public class Ruta {

    private String origen;
    private String destino;
    private int distancia;
    private int tiempoEstimado;

    public Ruta(String origen, String destino, int distancia, int tiempoEstimado) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
}
