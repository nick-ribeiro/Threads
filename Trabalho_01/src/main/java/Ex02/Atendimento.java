package Ex02;

/**
 * Thread que contem o atendimento realizado pelo restaurante
 * @author Nicolas
 */
public class Atendimento extends Thread{
    
    private Garcom nome;

/**
* <p> Recebe a variavel nome referente a sincronização da classe Garcom <p>
**/    
    public Atendimento(Garcom nome){
        this.nome = nome;
    }
    
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                for(int j = 0; j <= 4; j++) {
                    if(j == 4) {
                        System.out.println(this.nome.getChefe() + " terminou o prato, o garçom entregara o prato, proximo chefe prepare o pedido!");
                        Thread.sleep(1000);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
