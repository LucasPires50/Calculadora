
package operação;


public class OperaçoesAvançadas {
    
    public double potencia(double base, double expoente){
         
        double resultado = 1;
        
        for (int i = 0; i < expoente; i++){
            
            resultado = base * resultado;
            
        }
        return resultado;
    }
    public double porcentagem(double valor, double percentual){
        
        double resultado = (valor * percentual) / 100;
        return resultado;
    }
    public double areaQuadrada (double largura, double centimetros){
        
        double resultado = largura * centimetros;
        return resultado;
    }
    public double imc (double peso, double altura){
        
        double resultado = peso / (altura * altura);
        return resultado;
    }
    public double raizQuadrada (double raiz){
        
        double resultado = Math.sqrt(raiz);
        return resultado;
    }
    

}
