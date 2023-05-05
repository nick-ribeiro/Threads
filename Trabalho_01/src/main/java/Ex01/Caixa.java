package Ex01;

/**
 * Classe Caixa tem a função de sincronizar o projeto.
 * @author Nícolas
 */
public class Caixa {
    
    private String nome;
    private boolean atendido;
    
 /**
 * <p> Recebe um boolean equivalente a falso para fazer a sincronização </p>
 **/
    public Caixa(){
        this.atendido = false;
    }

/**
 * <p> Metodo construtor de receber o nome da pessoa e fazer a sincronização de forma que em quanto ela não terminar de ser
 * atendida os outros terão de esperar </p>
 * @return nome
 */
    public synchronized String getPessoa() {
        try {
            while (!this.atendido) {
                wait();
            }
            this.atendido = false;
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nome;
    }
    
/**
 * <p> Metodo de sincronização para setar o nome da pessoa </p>
 */  
    public synchronized void setPessoa(String nome) {
        try {
                while (this.atendido)
                    wait();
                this.nome = nome;
                this.atendido = true;
                notify();
        } catch (Exception e) {

            e.printStackTrace();
        }
        this.nome = nome;
    }
}
