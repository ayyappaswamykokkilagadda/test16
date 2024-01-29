class evilnumber
{
   public static void main(String[]args)
   {
     int numb=45,rem=0,square,sum=0;
     square=(int)Math.pow(numb,2);

     for(;square>0;square/=10)
     {
         rem=square%10;
         sum=sum+rem;
     }
        if(numb==sum)
         System.out.println("evil number");
        else
          System.out.println("not evil number");
   }
}