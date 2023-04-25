

package cliente;


/*
*  Professor Gerson Risso
*/
import lista.*;
public class UsaLista {
 
    public static void main(String[] args) {
       Lista lista=new Lista();
      //  lista.inserir(new Contato("Gerson", "233-2332"));
      //  lista.inserir(new Contato("Sandra", "546-7473"));
      //  lista.inserir(new Contato("Anna", "854-6432")); 

       System.out.println("Array Atual");
       lista.mostrar();
       System.out.println("============================");

    //    Adiciona dois novos contatos ao inicio da lista
       System.out.println("Adiciona novo contato ao inicio do array (Isabela)");
       lista.inserirNoInicio(new Contato("Isabela", "323-7341"));        
       System.out.println("============================");
       
    //    Mostra nova lista
       System.out.println("Nova lista de contatos");
       lista.mostrar();
       System.out.println("============================");
       
    //    Mostra tamanho da lista
       System.out.println("Quantidade de elementos do array");
       System.out.println(lista.tamanho());

   // Insere no fim
      System.out.println("Adiciona novo contato ao inicio do array (Teste)");
       lista.inserir(new Contato("Teste1", "323-7341"));        
       System.out.println("============================");
       
        //    Mostra nova lista
        System.out.println("Nova lista de contatos");
        lista.mostrar();
        System.out.println("============================");

           // Insere no fim
      System.out.println("Adiciona novo contato ao fim do array (Teste)");
      lista.inserir(new Contato("Teste2", "323-7341"));        
      System.out.println("============================");
      
       //    Mostra nova lista
       System.out.println("Nova lista de contatos");
       lista.mostrar();
       System.out.println("============================");


      //    Adiciona dois novos contatos ao inicio da lista
      System.out.println("Adiciona novo contato ao inicio do array (Inicio)");
      lista.inserirNoInicio(new Contato("Inicio", "323-7341"));        
      System.out.println("============================");

      // Insere no fim
      System.out.println("Adiciona novo contato ao inicio do array (Teste)");
      lista.inserir(new Contato("Teste3", "323-7341"));        
      System.out.println("============================");

      //    Mostra nova lista
      System.out.println("Nova lista de contatos");
      lista.mostrar();
      System.out.println("============================");
      
       //    Mostra nova lista
       System.out.println("Nova lista de contatos");
       lista.mostrar();
       System.out.println("============================");

       Object[] obj=lista.buscar(2);
       if(obj!=null){
           System.out.println(obj[2]);
       }else{
           System.out.println("N�o achou!");
       }
    }

}
