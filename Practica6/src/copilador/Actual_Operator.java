package copilador;

public class Actual_Operator extends Operator{
    private char oper;
    public Actual_Operator (char op) {oper= op;}
    
    public boolean Parse_And(){
        if(Lex.Token_Class == oper ) {Lex.Get_Token(); return true ;}
        return false; 
        
    }
    public void Print () {System.out.print(oper);}
    public int Interpret ( int e_left, int e_right){
        switch (oper){
            case '+': return e_left + e_right ;
            case '*': return e_left * e_right; 
        }
        return 0;
    }
    public void Generate_Code (){
        switch (oper){
            case '+': System.out.print("ADD\n"); break;
             case '*': System.out.print("MULT\n"); break;
            
        }
    }
}
