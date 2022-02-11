import java.io.*;
import javax.swing.*;

public class Main {
Main(){
       String path;
       path="entrada.txt";
try {
       Yylex lexer = new Yylex(new FileReader(path));
       parser p = new parser(lexer);
       p.parse();
       interfaz.rotular( "end of scanner");
       } catch (Exception ex) {
       interfaz.rotular("se arruino en el proceso "+ ex.toString());
       ex.printStackTrace();
       } finally { }
}

public static void main(String[] args) {
       new interfaz().setVisible(true);
}}
