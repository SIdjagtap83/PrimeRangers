import java.util.*;
import java.lang.Math;

class PrimeRangers
{
  
     public static void main(String args[])
      {        
         
               int M = 1000000007;
               int range = (int)Math.pow(10, 18);

                Scanner sc = new Scanner(System.in);
                // Scan Number Of Inputs
                int n=sc.nextInt();
                sc.nextLine();
         if(n<1||n>5)
         {
            System.out.println("Input Out Of Range");
         }
         else
         {  
                // Objects created (size same as that of the inputs)
                OperationOnPR[] obj = new OperationOnPR[n];

                for(int i=0;i<n;i++)
                {
                     int fn = sc.nextInt();
                     int ln = sc.nextInt();

                     if(fn<1||fn>ln||ln>range)
                     {
                        System.out.println("Input Out Of Range");
                        
                     }
                     else
                     {
                         // object initialization 
                          obj[i] = new OperationOnPR(fn, ln);
                          sc.nextLine();   
                    } 
                }
                sc.close();

                for(int i=0;i<n;i++)
                {
                  System.out.println(obj[i].numberOfPrimeRangers()%M);
                }

         }
                
      }
       
       

}

class OperationOnPR
{
    private int first_num,last_num;
    private int no_2,no_3,no_5,no_7,count,temp;

    OperationOnPR(int first_num,int last_num){

        this.first_num = first_num;
        this.last_num = last_num;

    }

        // Getter
        public int getFirstNum()
         {
            return first_num;
        }

        public int getLasttNum()
        {
           return last_num;
       }

         // Setter
         public void setFirstNum(int first_num) 
         {
            this.first_num = first_num;
         }

         public void setLastNum(int last_num) 
         {
            this.last_num = last_num;
         }

        
         // Returning number of Prime Rangers
         public int numberOfPrimeRangers()
         {
            count = 0;
            for(int F=this.first_num;F<=this.last_num;F++)
            {
                  no_2=0;
                  no_3=0;
                  no_5=0;
                  no_7=0;
                  
                if(F/10==0)
                  {
                    countingPrimeNumbers(F);
                  }
                else
                  {
                      int T = F;

                    while(T>0)
                    {
                     temp = T%10;
                     T = T/10;
                     countingPrimeNumbers(temp);  
                     }

                  }

                    
                   if(!(no_2>=no_3&&no_3>=no_5&&no_5>=no_7))
                      {
                         count+=1;
                      }     
                    

            }

            

            return this.last_num - this.first_num - count + 1;
         }


         public void countingPrimeNumbers(int F2){

                     if(F2==2)
                        {
                        no_2+=1;
                        }
                     if(F2==3)
                        {
                        no_3+=1;
                        }
                     if(F2==5)
                        {
                        no_5+=1;
                        }
                     if(F2==7)
                        {
                        no_7+=1;
                        }   

         }

}
