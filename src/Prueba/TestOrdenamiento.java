/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Datos.Desordenados;
import Datos.Ordenados;
import javax.swing.JOptionPane;

/**
 *
 * @author Noemí Lara Acono
 */
public class TestOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Desordenados m;
        //DatosOrdenados datosOrd;
        int n, s; 
        long t, t1, t2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuál es el valor máximo?"));
        
        m = new Desordenados(s, n);
        m.generarValores();
        System.out.println("" + m);
        
        t1 = System.nanoTime();   // start
            Ordenados mob = m.bubbleSort();
            t2 = System.nanoTime();   // stop
            t= t2 - t1;
            System.out.println("n="+ n + " t=" + t + " ns. Burbuja=" + mob);
            t1 = System.nanoTime();   // start
            Ordenados moi = m.insertSort();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n="+ n + " t=" + t + " ns. Inserción" + moi);
    }
    
}