/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class ProblemaVrptw {

    private int capacidad;
    private List<Nodos> nodos = new ArrayList();

    public ProblemaVrptw(String archivo, int c) throws FileNotFoundException, IOException {
        String patch = "instancias/" + archivo;
        capacidad = c;
        nodos = Nodos.fileToArrayNodos(patch);
        System.out.println(patch + " capacidad:" + String.valueOf(c));
        for (Nodos n : nodos) {
            System.out.println(n);
        }
    }
}
