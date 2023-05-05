package Ex02;

/**
 * <p> Thread que contem os chefs que irao preparar os pedidos </p>
 * @author Nicolas
 */
public class Chefs extends Thread{
    
    Garcom nome;
    String pessoa[] = {"Julia", "Marcia", "Marcos", "Manu", "Mario", "Mona", "Vinicius", "Lucas", "Luiz", "Lauro"};

/**
 * <p> Classe Chefs recebe a variavel nome da classe Garcom com a intenção de realizar a sincronização </p>
 */    
    public Chefs(Garcom nome){
        this.nome = nome;
    }
 
/**
 *  <p> No metódo run é pego o primeiro chef da fila através do array de pessoas e faz-se um outro for para
 *  mostrar a quantidade de tempo na qual o chef está preparando o pedido e a proximo chef terá de aguardar para preparar
 *  o pedido. </p>   
 *  @since 1.0
 */ 
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                for(int j = 0; j <= 4; j++) {
                    System.out.println(pessoa[i] + " esta preparando o prato aguarde " + (j + 1) + " minutos para o proximo"
                        + " chefe preparar o prato");
                    Thread.sleep(500);
                    if(j == 4) {
                        nome.setChefe(pessoa[i]);
                        Thread.sleep(1000);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
