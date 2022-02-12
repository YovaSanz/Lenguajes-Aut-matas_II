package copilador;


public class Digit extends Expression {
    private char digit ='\0';
     public boolean Parse_And(){
         if(Lex.Token_Class == Lex.DIGIT){
             digit=Lex.Token_Char_Value;
             Lex.Get_Token();
             return true;
             }
             return false;
        }
         public void Print() {System.out.print(digit);}
         public int Interpret() { return digit -'0';}
         public void Generate_Code(){
        System.out.print("PUSH"+ digit+ "\n");
    }
}
