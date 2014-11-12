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
    
    public void remove(Nodo n){
        float nCosto = 0;
        for(Recorrido r:recorridos){
                r.remove(n);
                if(r.getSize()==0)
                    recorridos.remove(r);
                nCosto+=r.getCosto();
        }
    }
    
    public void add(Nodo n, int capacidad){
        float min = 0;
        int posMin = -1;
        float costoAux = 0;
        float nCosto = 0;
        for(int x=0; x<recorridos.size();x++){
            costoAux = recorridos.get(x).costoDeInsertar(n);
            if(costoAux<min && costoAux<(float)capacidad){
                min=costoAux;
                posMin=x;
            }
        }
        if(posMin>=0){
            recorridos.get(posMin).add(n);
        }else{
            Recorrido nR = new Recorrido();
            nR.add(n);
            recorridos.add(nR);
        }
        for(Recorrido r:recorridos){
                nCosto+=r.getCosto();
        }
    }
}
