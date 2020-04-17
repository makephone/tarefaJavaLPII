	
import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	   //inicializa variaveis que o usuario vai digitar
	    int numero;
	    int opcion;

	   //bloco de controle de falhas;
	  try {
	    //pede para o usuario o numero 
	    System.out.println("Digite o numero ! ");
	    Scanner n = new Scanner(System.in);
	    numero = n.nextInt();
	    //pede para o usuario a listagem 
        System.out.println("Digite 1 para ordem crescente ! ");
        System.out.println("Digite 0 para ordem decrescente ! ");
	    Scanner op = new Scanner(System.in);
	    opcion = op.nextInt();
	  
	  if (opcion==1){
	  	for(int i=0;i<numero+1;i++){
		    	System.out.println(i);
		}
	   
	  }
	  
	   if (opcion==0){
	     
	     	for(int i=0;i<numero+1;i++){
		    	System.out.println(numero-i);
		}
	     
	     
	  }
	  
	   
		System.out.println("FIM .....!");
	      
	  } catch(Exception e) {
	       //imprime o erro
	       System.out.println("Erro: "+e);
	      
	  }
	  
	    
	    
	  
	}
	
	
 

	
	
}