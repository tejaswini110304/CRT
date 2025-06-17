package arithematic;
public class ArithematicOperations
{
public int a,b;
public ArithematicOperations(int a,int b)
{
this.a=a;
this.b=b;
}
public int add()
{
return(a+b);
}
public int sub()
{
return(a-b);
}
public int mul()
{
return(a*b);
}
public double div()
{
return((double)(a)/b);
}
public int rem()
{
return(a%b);
}
}
