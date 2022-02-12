package copilador;


public abstract class Expression {
    public static Expression Parse_Or (){
     Parenthesized_Expression pe=new Parenthesized_Expression();
     if (pe.Parse_And()) return pe;
     Digit d=new Digit();
     if (d.Parse_And()) return d;
     return null;
    }
     abstract public void Print();
     abstract public int Interpret();
     abstract public void Generate_Code();
}
