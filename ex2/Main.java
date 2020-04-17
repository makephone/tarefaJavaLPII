public class Main
{
	public static void main(String[] args) {
	 
	 float media1;
	 media1=media(8,9,7);
	 System.out.println("Numero de Dias Conforme Idade: "+media1);
	 
	  float media2;
	 media2=media(4,5,6);
	 System.out.println("Numero de Dias Conforme Idade: "+media2);
	 
	 float soma=somaMedia(media1,media2); 
	 System.out.println("Numero de Dias Conforme Idade: "+soma);
	 
	 
	  System.out.println("Media das media é : "+soma/2);
	 
	 }
	
	
public static float media(int  n1,int n2,int n3){
    
    return (n1+n2+n3)/3;  //retorna a media aritmetrica
} 


public static float somaMedia(float media1,float media2){
    return media1+media2;  //retorna ano para dias
} 


	
	
}