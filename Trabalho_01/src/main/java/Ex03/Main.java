package Ex03;

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
 * <p> Criação da variavel nome na classe Livro, a qual será passada para todas as outras Threads </p>
 */  
        Livro nome = new Livro();

/**
 *  <p> São criadas as Threads tanto para Pessoas quanto para a Liberacao. </p>   
 *  @since 1.0
 */           
        Pessoa pessoas = new Pessoa(nome);
        pessoas.start();
        
        Liberacao atendida = new Liberacao(nome);
        atendida.start();
    }
}
