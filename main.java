class amazon{
int prodid;
int quantity;
int price;
void stockvalue(int a , int b)
{
int val=a*b;
System.out.println("The stock value is:"+val);
}
}
class main{
public static void main(String args[])
{
amazon a1=new amazon();
amazon a2=new amazon();
a1.stockvalue(2,100);
a2.stockvalue(3,50);
}
}