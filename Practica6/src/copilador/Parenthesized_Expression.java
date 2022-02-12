package copilador;


public class Parenthesized_Expression extends Expression {
    private Expression left ;
    private Operator oper;
    private Expression right;
     
    public boolean Parse_And (){
         if(Lex.Token_Class == '(') {
             Lex.Get_Token();
             if ((left = Expression.Parse_Or())== null){
                 System.err.print("Missing left expression");
                 return false; 
             }
             if ((oper= Operator.Parse_Or()) == null ){
                 System.err.println("Missing operator");
                 return false;
             }
             if((right= Expression.Parse_Or())== null ){
                 System.err.print("Missing right expression");
                 return false; 
             }
             if (Lex.Token_Class != ')'){
             System.err.print("Missing) added ") ;
         }
             else {Lex.Get_Token();}
             return true;
         }
         return false;
    }
    public void Print (){
        System.out.print('(');
        left.Print(); oper.Print (); right.Print();
        System.out.print(')');
    }
    public int Interpret (){
        return oper.Interpret (left.Interpret(),right.Interpret());
    }
    public void Generate_Code(){
        left.Generate_Code();
        right.Generate_Code();
        oper.Generate_Code();   
    }
}
