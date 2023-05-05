package Ex03;

/**
 * Classe Livro tem a funcao de sincronizar o projeto.
 * @author Nícolas
 */
public class Livro {
    
    private String nome;
    private boolean concluido;

 /**
 * <p> Recebe um boolean equivalente a falso para fazer a sincronização </p>
 **/    
    public Livro(){
        this.concluido = false;
    }

/**
 * <p> Metodo construtor de receber o nome da pessoa e fazer a sincronização de forma que em quanto ela não terminar de ler
 * o livro os outros terão de esperar para poder ler-lo </p>
 * @return nome
 */
    public synchronized String getPessoa() {
        try {
            while (!this.concluido) {
                wait();
            }
            this.concluido = false;
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
                while (this.concluido)
                    wait();
                this.nome = nome;
                this.concluido = true;
                notify();
        } catch (Exception e) {

            e.printStackTrace();
        }
        this.nome = nome;
    }
}
