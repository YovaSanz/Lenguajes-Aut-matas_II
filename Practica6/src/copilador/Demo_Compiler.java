package copilador;


public class Demo_Compiler {
    public static void main(String[]args){
     Lex.Get_Token();
     Expression icode=Expression.Parse_Or();
     if (Lex.Token_Class !=Lex.EOF){
         System.err.println("Garbage at end of program ignored");
}
     if(icode==null){
          System.err.println("No intermeduate code produced");
          return;
}
     System.out.print("Expression: ");
     icode.Print();
     System.out.println();

     System.out.print("Interpreted: ");
     System.out.println(icode.Interpret());
     System.out.print("Code: ");
     icode.Generate_Code();
     System.out.println("PRINT: ");
    }
}
