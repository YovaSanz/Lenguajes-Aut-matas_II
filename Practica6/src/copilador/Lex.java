package copilador;

import java.io.IOException;


public class Lex {
    public static int Token_Class;
     public static final int EOF=256;
     public static final int DIGIT=257;
     public static char Token_Char_Value;

     public static void Get_Token(){
         char ch;
         do{int ch_or_EOF;
         try {ch_or_EOF=System.in.read();}
         catch (IOException ex) {ch_or_EOF=-1;}
         if (ch_or_EOF<0) {Token_Class = EOF; return;}
         ch=(char) ch_or_EOF;
        } while (Character.isWhitespace(ch));

         if(Character.isDigit(ch)) {
         Token_Class = DIGIT; Token_Char_Value=ch;
         }
         else{
         Token_Class=ch;
         }
     }
}
