package inter;

import simbolos.*;


public class Do extends Instr{ 
    Expr expr;
    Instr instr;
    public Do() { expr = null; instr = null; }
    public void inic(Instr s, Expr x) {
        expr = x; instr = s;
        if( expr.tipo != Tipo.Bool ) expr.error("se requiere booleano en do");
    }
    public void gen(int b, int a) {
        despues = a;
        int etiqueta = nuevaEtiqueta(); 
        emitirEtiqueta(etiqueta);
        expr.salto(b,0);
    }
}