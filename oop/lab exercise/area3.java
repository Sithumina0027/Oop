import java.util.Scanner;
public class area3
{
    int lenth;
    int breadth;
    public void method()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the lenth");
        lenth=input.nextInt();

        System.out.println("Enter the breadth");
        breadth=input.nextInt();      


    }
    public int method2()
    {
       int area=lenth*breadth;
       return area;
    }    
    public static void main(String[] args)
    {
        area obj=new area();
        obj.method();
        
        int result=obj.method2();
        System.out.println(""+result);

        
    }
}