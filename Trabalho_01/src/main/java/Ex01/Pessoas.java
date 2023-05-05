package Ex01;

/**
 * Thread que contem as pessoas esperando na fila para serem atendidas pelo caixa
 * @author Nicolas
 */
public class Pessoas extends Thread{
    
    Caixa nome;
    String pessoa[] = {"Julia", "Marcia", "Marcos", "Manu", "Mario", "Mona", "Vinicius", "Lucas", "Luiz", "Lauro"};
    
/**
 * <p> Classe Pessoas recebe a variavel nome da classe Caixa com a intenção de realizar a sincronização </p>
 */
    public Pessoas(Caixa nome){
        this.nome = nome;
    }
    
 /**
 *  <p> No metódo run é pego a primeira pessoa da fila através do array de pessoas e faz-se um outro for para
 *  mostrar a quantidade de tempo na qual a pessoa está sendo atendida e a proxima terá de aguardar para liberar o caixa. </p>   
 *  @since 1.0
 */ 
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= 3; j++) {
                    System.out.println(pessoa[i] + " esta sendo atendido(a) em " + (j + 1) + " minutos o caixa estara liberado");
                    Thread.sleep(500);
                    if(j == 3) {
                        nome.setPessoa(pessoa[i]);
                        Thread.sleep(1000);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
