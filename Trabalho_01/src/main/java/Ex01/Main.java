package Ex01;

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
 * <p> Criação da variavel nome na classe Caixa, a qual será passada para todas as outras Threads </p>
 */        
        Caixa nome = new Caixa();
        
/**
 *  <p> São criadas as Threads tanto para Pessoas quanto para o Atendimento. </p>   
 *  @since 1.0
 */   
        Pessoas pessoas = new Pessoas(nome);
        pessoas.start();
        
        Atendimento atendida = new Atendimento(nome);
        atendida.start();
    }
}
