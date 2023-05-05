package Ex02;

/**
 * Classe Garcom tem a funcao de sincronizar o projeto.
 * @author Nícolas
 */
public class Garcom {
    
    private String nome;
    private boolean atendido;

 /**
 * <p> Recebe um boolean equivalente a falso para fazer a sincronização </p>
 **/    
    public Garcom(){
        this.atendido = false;
    }

/**
 * <p> Metodo construtor de receber o nome do chef e fazer a sincronização de forma que em quanto ela não terminar de preparar
 * o pedido os outros terão de esperar </p>
 * @return nome
 */
    public synchronized String getChefe() {
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
 * <p> Metodo de sincronização para setar o nome do chef </p>
 */  
    public synchronized void setChefe(String nome) {
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
