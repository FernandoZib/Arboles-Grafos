/**
 * @see https://www.jc-mouse.net/
 * @author mouse
 */
public class Matriz_de_adyacencia {
    
    private int n;
    private int[][] matriz;
    
    /**
     * Constructor de clase
     * @param n numero de nodos
     */
    public Matriz_de_adyacencia(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        //se inicializa matriz en 0
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public void agregar(int i, int j){
        matriz[i][j] += 1;
    }
    
    public void remover(int i, int j){
        if(matriz[i][j]>0)
            matriz[i][j] -= 1;
    }
    
    public void imprimir(){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
    
    public static void main(String[] args) { 
        
        Matriz_de_adyacencia matriz = new Matriz_de_adyacencia(5);
        
        matriz.agregar(0, 1);
        matriz.agregar(0, 1);
        matriz.agregar(0, 2);
        matriz.agregar(0, 3);
        
        matriz.agregar(1, 0);
        matriz.agregar(1, 0);
        matriz.agregar(1, 4);
        
        matriz.agregar(2, 0);
        matriz.agregar(2, 3);
        matriz.agregar(2, 4);
        
        matriz.agregar(3, 0);
        matriz.agregar(3, 2);
        
        matriz.agregar(4, 1);
        matriz.agregar(4, 2);
        matriz.agregar(4, 4);
        matriz.agregar(4, 4);
        
        matriz.imprimir();
    }
}
 