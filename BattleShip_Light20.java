
import java.util.Scanner;
public class BattleShip_Light20
{  static boolean[][] mat= new boolean [10][10];
    public static void main(String[] args) 
	{ caricamento();generatore();acquisizione(); 
	
	}
 	public static void caricamento() 
 	{int i,j;	 
 	  for(i=0;i<10;i++)
 		{for(j=0;j<10;j++)
 			{
 			 mat [i][j]= false;
 			}
 			
 		}	
 	}
 		public static void generatore() 
 		{ int num1,num2,cont=0;
		 
 		 
 			  do
 				{num1=(int)(Math.random()*9);
 			     num2=(int)(Math.random()*9);
 			      mat [num1][num2]= true;
 			      cont=cont+1;
 				}while(cont<5); 
 			  
 		   
 		 }
 			public static void acquisizione() 
 		{
 			 int i,j; int colpita = 0; 
System.out.print("Benvenuto nel gioco Battle Ship Light. Il gioco funziona con coordinate da 0 a 9. \n");			   
           do{	
             do{   Scanner leggi= new Scanner(System.in);
 			 		
 			 	    do{ System.out.print("\nDammi la coordinata dell'asse x: ");
 			 	    	i= leggi.nextInt();
 			 	    	
 			 	      }
 			 	    while(i<0 || i>9);
 			 	    
 			 	    
 			 	   do{ System.out.print("Dammi la coordinata dell'asse y: ");
 			 		   j= leggi.nextInt();
 			 		 
 			 	      } while(j<0 || j>9);
             }while(mat[i][j]!= true);
 			 		colpita= colpita +1; mat [i][j]= false;
 			 		System.out.print("Hai colpito la nave");
 			 		
 			 	}
 			 	while(colpita<5);
 			 	System.out.print("Complimenti, hai vinto!!\n");
		}
 				
}
