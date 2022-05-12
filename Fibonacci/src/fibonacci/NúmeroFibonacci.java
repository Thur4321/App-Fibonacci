
package fibonacci;

public class NúmeroFibonacci {
    
    private int número;
    
    public int getNúmero(){
        return número;
    }
    
    public void setNúmero(int fibonacci){
        número=fibonacci;
    }
    
    public String fibonacci(){
        String resultado = "1";
        int fibonacci = 1, ant = 0, prox = 0, cont = 2;
        while (cont <= número){
            prox = fibonacci + ant;
            resultado = resultado+" "+prox;
            ant = fibonacci;
            fibonacci = prox;
            cont++;
        }
        return resultado;
    }
}
