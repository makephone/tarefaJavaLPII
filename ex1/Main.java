/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
	
import java.util.Scanner;
import java.util.Calendar;

public class Main
{
	public static void main(String[] args) {
	   //inicializa variaveis que o usuario vai digitar
	    int diaDia;
	    int mesDia;
	    int anoDia;
//inicializa variaveis que o CALCULA O ESTANTE ATUAL	    
    Calendar nowDay = Calendar.getInstance();
    int DIA = nowDay.get(Calendar.DAY_OF_MONTH);
     
	int MES = nowDay.get(Calendar.MONTH);    
	
	int ANO = nowDay.get(Calendar.YEAR);    
	    
	    
	    
	   //bloco de controle de falhas;
	  try {
	    //pede para o usuario o dia que nasceu
	    System.out.println("Digite o dia que voce nasceu ");
	    Scanner dia = new Scanner(System.in);
	    diaDia = dia.nextInt();
	    //pede para o usuario o mês que nasceu
        System.out.println("Digite o mês que voce nasceu ");
	    Scanner mes = new Scanner(System.in);
	    mesDia = mes.nextInt();
	     //pede para o usuario o ano que nasceu
	    System.out.println("Digite o ano que voce nasceu ");
	    Scanner ano = new Scanner(System.in);
	    anoDia = ano.nextInt();
	   //processar o calculo chamando as funcoes 
	   diaDia=diaDia+mes(mesDia)+ano(anoDia);
	   
	   diaDia=(DIA+mes(MES)+ano(ANO))-diaDia;
	   
	   
		System.out.println("Numero de Dias Conforme Idade: "+diaDia);
	      
	  } catch(Exception e) {
	       //imprime o erro
	       System.out.println("Erro: "+e);
	      
	  }
	  
	    
	    
	  
	}
	
	
public static int mes(int mes){
    return mes*30;  //retorna o mes para dias 
} 

public static int ano(int ano){
    return ano*365;  //retorna ano para dias
} 
	
	
}
