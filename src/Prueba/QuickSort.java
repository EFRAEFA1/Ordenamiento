package Prueba;
import Datos.Ordenados;

public class QuickSort{
    
static int mo=0;
    public static void main(int arreglo[], int izq, int der) {
        int pivote=arreglo[izq]; 
        int i=izq;         
        int j=der;         
        int aux;
 
        while(i < j){                                                        
            while(arreglo[i] <= pivote && i < j) 
                i++; 
            while(arreglo[j] > pivote) 
                j--;         
            if (i < j) {                                            
                aux= arreglo[i];                     
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
            }
            mo++;
        }
   
        arreglo[izq]=arreglo[j];                                         
        arreglo[j]=pivote;      
   
        if(izq < j-1) {
            quicksort(arreglo,izq,j-1);          
            mo++;
        }
        if(j+1 < der){
            quicksort(arreglo,j+1,der);          
            mo++;
        }
    }

    private static void quicksort(int[] arreglo, int izq, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Ordenados QuickSort(){
        int [] q = this.getCopiaValores();
	    QuickSort.quicksort(q, 0, q.length-1);
        System.out.println("QS-comparaciones = " + mo);
	    return new Ordenados(q);
    }

    private int[] getCopiaValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}