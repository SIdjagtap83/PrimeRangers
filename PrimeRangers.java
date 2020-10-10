import java.util.*;

class PrimeRangers
{

     public static void main(String args[])
       {
                int no_2,no_3,no_5,no_7,count,temp=0;
                
                Scanner sc = new Scanner(System.in);
/*                int n=sc.nextInt();
                sc.nextLine();

                for(int i=0;i<n;i++)
                {
*/                     int fn = sc.nextInt();
                     int ln = sc.nextInt();
                     count=0;
                     
                     

                     for(int F=fn;F<=ln;F++)
                     {
                           no_2=0;
                           no_3=0;
                           no_5=0;
                           no_7=0;
                           


                         if(F/10==0)
                           {
                             if(F==2)
                                 {
                                 no_2+=1;
                                 }
                              if(F==3)
                                 {
                                 no_3+=1;
                                 }
                              if(F==5)
                                 {
                                 no_5+=1;
                                 }
                              if(F==7)
                                 {
                                 no_7+=1;
                                 }   

                           }
                         else
                           {

                             while(F>0)
                             {
                              temp = F%10;
                              F = F/10;
                                 if(temp==2)
                                    {
                                     no_2+=1;
                                    }
                                 else if(temp==3)
                                    {
                                     no_3+=1;
                                    }
                                 else if(temp==5)
                                    {
                                     no_5+=1;
                                    }
                                 else if(temp==7)
                                    {
                                     no_7+=1;
                                    }   
                                 else{}
                              
                              

                              }

                           }

                             
                            if(no_2>=no_3&&no_3>=no_5&&no_5>=no_7)
                               {
                                  System.out.println(F);
                               }     
                             

                     }

                             
                     
                     
//                }
                

       }

}
