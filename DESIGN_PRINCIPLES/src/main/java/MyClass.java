import java.util.*;
public class MyClass {
    static int Add(int a,int b)
    {
        return (a+b);
    }
    static int Mul(int a,int b)
    {
        return a*b;
    }
    static int Div(int a,int b)
    {
        try{
            int result=a/b;
            return result;
        }catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }
    }
    static int Sub(int a,int b)
    {
        return a-b;
    }
    public static void main(String args[]) {
   
   Scanner sc=new Scanner(System.in);
   int choice;
   boolean flag=false;
   int first_num,second_num,result;
   do{
     System.out.println("Functions :\n1.Addition\n2.Multiplication\n3.Division\n4.Subtraction\n5.Exit");
     System.out.println("Enter the User Choice:");
      choice=sc.nextInt();
      switch(choice)
      {
        case 1:  System.out.println("Enter the first number");
                  first_num=sc.nextInt();
                 System.out.println("Enter the Second number");
                  second_num=sc.nextInt();
                  result=Add(first_num,second_num);
                 System.out.println(first_num+" + "+second_num+" = "+result);
                 break;
        case 2:  System.out.println("Enter the first number");
                  first_num=sc.nextInt();
                 System.out.println("Enter the Second number");
                  second_num=sc.nextInt();
                  result=Mul(first_num,second_num);
                 System.out.println(first_num+" * "+second_num+" = "+result);
                 break;
        case 3:  System.out.println("Enter the first number");
                  first_num=sc.nextInt();
                 System.out.println("Enter the Second number");
                  second_num=sc.nextInt();
                  result=Div(first_num,second_num);
                  if(result!=-1)
                 System.out.println(first_num+" / "+second_num+" = "+result);
                 break;
        case 4:  System.out.println("Enter the first number");
                  first_num=sc.nextInt();
                 System.out.println("Enter the Second number");
                  second_num=sc.nextInt();
                  result=Sub(first_num,second_num);
                 System.out.println(first_num+" - "+second_num+" = "+result);
                 break;
        case 5: System.out.println("--------Exiting--------");
                flag=true;
                break;
        default : System.out.println("Invalid Choice!");
      }
   }while(!flag);
    }
}
