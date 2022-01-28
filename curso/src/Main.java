
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int barras = sc.nextInt();
       int j = barras,i=0;
       int contA=0,contB=0;
       boolean comp = true;
       int [] tiempo = new int [barras];
       
       while(barras != i){
           tiempo[i] = sc.nextInt(); 
           i++;
       }
       i=0;
       j= barras;
       while(tiempo[i] != tiempo[j]){
           if(tiempo[i] != 0){
               tiempo[i] = tiempo[1] - 1;
           }else{
               i++;
               contA++;
           }
           
           if(tiempo[j] != 0){
               tiempo[j] = tiempo[j] - 1;
           }else{
               j--;
               contB++;
           }
           
           
       }
        System.out.println(contA +" "+ contB);
    }
    
}
