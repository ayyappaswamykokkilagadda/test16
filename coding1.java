class powernumber
{
   public static void main (String[]args)
   {
       int num=217,rem=0,sum=0,mul=1;
       while(num>0)
       {
           rem=num%10;
           num=num/10;
           sum=sum+rem;
           mul=mul*rem;
       }
           if(sum==mul)
               System.out.println("power number");
           else
            System.out.println("not power number");    
   } 
}