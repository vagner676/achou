
package funcoes;


public class Funcoes {

   
    public static void main(String[] args) {

    int A []= {2,5,6,4};
    int B []= {4,6,7,8};   
    String res = Inter(A, B);
    System.out.println("Resultado: "+res);
    }
    
    public static String Inter(int []a, int b[]){
   String res ="";
    for(int i = 0; i<a.length; i++){
      boolean achou = false;
       for(int j = 0; j<b.length;j++)  {
           if(a[i]==b[j]){
             achou = true;
               
               break;
           }
       } 
      if (!achou){
        res += a[i]+" ";
      }
         
}
    return res;
}
}
