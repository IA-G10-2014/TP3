/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.solucion;

import java.util.LinkedList;

/**
 *
 * @author marcelo
 */
public class Recorrido {

    public LinkedList<Nodo> nodos;
    public float costo;

    public LinkedList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(LinkedList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getSize(){
        return nodos.size();
    }
    public boolean esta(Nodo x) {
        if (nodos.isEmpty()) {
            return false;
        }
        for (Nodo n : nodos) {
            if (x.equals(n)) {
                return true;
            }
        }
        return false;
    }

    public float calcularCosto() {
        float c = 0;
        for (int x = 0; x < nodos.size() - 1; x++) {
            c += nodos.get(x).costo(nodos.get(x + 1));
        }
        return c;
    }

    public float costoDeInsertar(Nodo n) {
        float min = 0;
        int posMin = 0;
        float nCosto = 0;
        for (int x = 0; x < nodos.size(); x++) {
            nodos.add(x, null);
            nCosto = calcularCosto();
            if(nCosto<min){
                min = nCosto;
                posMin = x;
            }
            nodos.remove(n);
        }
        return nCosto;
    }
    
    public void add(Nodo n){
        float min = 0;
        int posMin = 0;
        float nCosto = 0;
        for (int x = 0; x < nodos.size(); x++) {
            nodos.add(x, null);
            nCosto = calcularCosto();
            if(nCosto<min){
                min = nCosto;
                posMin = x;
            }
            nodos.remove(n);
        }
        nodos.add(posMin,n);
        costo=nCosto;        
    }
    
    public void remove(Nodo n){
        if(nodos.indexOf(n)>=0)
            nodos.remove(n);
            costo=calcularCosto();
    }
}
