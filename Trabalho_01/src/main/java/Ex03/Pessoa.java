package Ex03;

/**
 * <p> Thread que contem as pessoas que irao alugar os livros e os livros que estao disponiveis para alugar </p>
 * @author Nicolas
 */
public class Pessoa extends Thread{
    
    Livro nome;
    String pessoa[] = {"Julia", "Marcia", "Marcos", "Manu", "Mario", "Mona", "Vinicius", "Lucas", "Luiz", "Lauro"};
    String livro[] = {"Em Busca do Tempo Perdido", "Ulysses", "Dom Quixote", "O Grande Gatsby", 
        "Cem Anos de Solidão", "Moby Dick", "Guerra e Paz", "Lolita", "Hamlet", "Orgulho e Preconceito"};

/**
 * <p> Classe Pessoa recebe a variavel nome da classe Livro com a intenção de realizar a sincronização </p>
 */
    public Pessoa(Livro nome){
        this.nome = nome;
    }

 /**
 *  <p> No metódo run é pego a primeira pessoa que irá alugar o livro através do array de pessoas, além de pegar o primeiro livro
 *  que irá ser alugado do array de livros e faz-se um outro for para mostrar a quantidade de tempo na qual a pessoa está com o livro
 *  e a proxima terá de aguardar o livro ser liberado para a leitura ou alugar um proximo livro. </p>   
 *  @since 1.0
 */     
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.println(pessoa[i] + " esta com " + livro[i] + " por " + (j + 1) + " dia(s)");
                    Thread.sleep(500);
                    if(j == 2) {
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
