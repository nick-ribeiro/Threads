package Ex03;

/**
 * Thread que contem o sistema de alugar os livros
 * @author Nicolas
 */
public class Liberacao extends Thread{
    
    private Livro nome;

/**
* <p> Recebe a variavel nome referente a sincronização da classe Livro <p>
**/    
    public Liberacao(Livro nome){
        this.nome = nome;
    }

/**
 *  <p> No metódo run é pego o nome da Pessoa que está com o livro e assim libera o livro para o aluguel. </p>   
 *  @since 1.0
 */     
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= 2; j++) {
                    if (j == 2) {
                        System.out.println(this.nome.getPessoa() + " terminou o livro, o mesmo esta disponivel para leitura");
                        Thread.sleep(1000);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
