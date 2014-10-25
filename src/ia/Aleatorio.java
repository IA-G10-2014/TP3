/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ia;
import java.util.Random;
/**
 *
 * @author marcelo
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float [] prob = new float[3];
        prob[0]= (float) 0.30;
        prob[1]= (float) 0.50;
        prob[2]= (float) 0.20;
        
        int [] result = new int [3];
        for(int i=0; i<1000000; i++){
            int r = generarAleatorio(prob);
            result[r]++;
        }
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    
    private static int generarAleatorio(float[] p){
        float ac=0;
        Random rnd = new Random();
        float r = rnd.nextFloat();
        for(int i=0; i<p.length;i++){
            ac += p[i];
            if(r<=ac){
                return i;
            }
        }
        return 0;
    }
    
}
