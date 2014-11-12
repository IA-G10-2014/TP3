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
public class Solucion {
    private List<Recorrido> recorridos;
    private float costo;

    public List<Recorrido> getRecorridos() {
        return recorridos;
    }

    public void setRecorridos(List<Recorrido> recorridos) {
        this.recorridos = recorridos;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public boolean esta(Recorrido x){
        if(recorridos.isEmpty())
            return false;
        for(Recorrido r:recorridos)
            if(r.equals(x))
                return true;
        return false;
    }
}
