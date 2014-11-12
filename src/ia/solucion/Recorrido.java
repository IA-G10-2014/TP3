/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ia.solucion;

import java.util.List;

/**
 *
 * @author marcelo
 */
public class Recorrido {
    public List<Nodo> nodos;
    public float costo;

    public List<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(List<Nodo> nodos) {
        this.nodos = nodos;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public boolean esta(Nodo x){
        if(nodos.isEmpty())
            return false;
        for(Nodo n: nodos)
            if(x.equals(n))
                return true;
        return false;
    }
}
