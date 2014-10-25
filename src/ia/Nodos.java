/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author marcelo
 */
public class Nodos {

    private int orden;
    private float x;
    private float y;
    private float demanda;
    private float ready;
    private float due;
    private float service;

    /**
     * @return the orden
     */
    public Nodos(int ordenA, float xA, float yA, float demandaA, float readyA, float dueA, float serviceA) {
        orden=ordenA;
        x=xA;
        y=yA;
        demanda=demandaA;
        ready=readyA;
        due=dueA;
        service=serviceA;
    }
    
    public static List<Nodos> fileToArrayNodos(String patch) throws FileNotFoundException, IOException{
        List<Nodos> nodos = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader(patch));
        String linea;
        while ((linea = br.readLine()) != null) {
            //Como el delimitador es una coma, lo indico al momento de invocar al StringTok
            StringTokenizer tokens = new StringTokenizer(linea, ";");
            //Ahora recupero los datos y los muestro, el trim solo elimina espacios en blanco si //es que los hay, una forma segura para leer datos:
            int orden = Integer.valueOf(tokens.nextToken().trim());
            float x = Float.valueOf(tokens.nextToken().trim());
            float y = Float.valueOf(tokens.nextToken().trim());
            float demanda = Float.valueOf(tokens.nextToken().trim());
            float ready = Float.valueOf(tokens.nextToken().trim());
            float due = Float.valueOf(tokens.nextToken().trim());
            float service = Float.valueOf(tokens.nextToken().trim());
            nodos.add(new Nodos(orden, x, y, demanda, ready, due, service));
        }
        return nodos;
    }

    public int getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the demanda
     */
    public float getDemanda() {
        return demanda;
    }

    /**
     * @param demanda the demanda to set
     */
    public void setDemanda(float demanda) {
        this.demanda = demanda;
    }

    /**
     * @return the ready
     */
    public float getReady() {
        return ready;
    }

    /**
     * @param ready the ready to set
     */
    public void setReady(float ready) {
        this.ready = ready;
    }

    /**
     * @return the due
     */
    public float getDue() {
        return due;
    }

    /**
     * @param due the due to set
     */
    public void setDue(float due) {
        this.due = due;
    }

    /**
     * @return the service
     */
    public float getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(float service) {
        this.service = service;
    }
    
    @Override
    public String toString(){
        return "Nodo " + String.valueOf(orden) + " en ("+ String.valueOf(x) + " , " + String.valueOf(y) + ")";
    }
}
