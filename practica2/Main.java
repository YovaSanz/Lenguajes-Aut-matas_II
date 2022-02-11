import java.io.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.*;

public class Main {
Main(){
       String path;
       path="archivo.txt";
try {
       conversor lexer = new conversor(new FileReader(path));
       parser p = new parser(lexer);
       p.parse();
       interfaz.rotular( "end of scanner"+"\n");
       } catch (Exception ex) {
       interfaz.rotular("se arruino en el proceso "+ ex.toString());
       ex.printStackTrace();
       } finally { }
}

public static void main(String[] args) {
       new interfaz().setVisible(true);
}}
