public class PrimeExample2{    
static void checkPrime(int n){  
  int i,m=0,flag=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is a composite number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is a composite number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  } 
}  
 public static void main(String args[]){    
  checkPrime(4);  
  checkPrime(54);  
  checkPrime(29);  
  checkPrime(71);  
  checkPrime(7);
  checkPrime(59);
  checkPrime(98);
  checkPrime(23);
}    
}
