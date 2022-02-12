package copilador;

public abstract class Operator {
    public static Operator Parse_Or(){
     Actual_Operator co_plus=new Actual_Operator('+');
     if(co_plus.Parse_And()) return co_plus;

     Actual_Operator co_times=new Actual_Operator('*');
     if(co_times.Parse_And()) return co_times;
     return null;
     }
     abstract public void Print();
     abstract public int Interpret(int e_left, int e_right);
     abstract public void Generate_Code();
    
}
