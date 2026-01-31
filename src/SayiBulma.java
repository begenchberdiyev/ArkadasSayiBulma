public class SayiBulma {
    public static void main(String args[]){
        long sayi = 810_000L;
       int toplam=0;
       for(int i=1;i<=sayi;i++){
        int kare =i*i;
           
           if(kare%2!=0){
           toplam+=kare;
              
           }
         
       }
       System.out.println(toplam);
        
       
    }
}