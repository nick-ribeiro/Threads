package Ex01;

/**
 * Thread que contem o atendimento realizado pelo caixa
 * @author Nicolas
 */
public class Atendimento extends Thread{
    
    private Caixa nome;
    
/**
* <p> Recebe a variavel nome referente a sincronização da classe Caixa </p>
**/
    public Atendimento(Caixa nome){
        this.nome = nome;
    }
    
 /**
 *  <p> no metódo run é pego o nome da Pessoa sendo atendida e assim libera a fila para o atendimento da proxima. </p>   
 *  @since 1.0
 */ 
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                for(int j = 0; j <= 3; j++) {
                    if(j == 3) {
                        System.out.println(this.nome.getPessoa() + " terminou o atendimento, caixa liberado");
                        Thread.sleep(1000);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
