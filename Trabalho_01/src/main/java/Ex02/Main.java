package Ex02;

/**
 * Classe main tem a funcao de inicializar o projeto.
 * @author Nícolas
 *
 */
public class Main {

/**
 * <p> Inicializacao do main </p>
 * @param args 
 */    
    public static void main(String[] args) {
        
/**
 * <p> Criação da variavel nome na classe Garcom, a qual será passada para todas as outras Threads </p>
 */  
        Garcom nome = new Garcom();
 
/**
 *  <p> São criadas as Threads tanto para os Chefs quanto para o Atendimento. </p>   
 *  @since 1.0
 */  
        Chefs pessoas = new Chefs(nome);
        pessoas.start();
        
        Atendimento atendida = new Atendimento(nome);
        atendida.start();
    }
}