public class Token {

    private String valor;
    private Tipos tipo;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * numeros y operadores de momento falta agregar para que analize todo el codigo.
     *
     */
    enum Tipos {
        NUMERO ("[ 0-9 ]+"),
        OPERADOR("[ * | / | + | - ]"),
        LITERAL ("[a-z]");
        /*
        ,
        PALABRASRESERVADAS("[ include | iostream | using | namespace | return | system | cout | main]"),

        OPERADORES("[int | string]");

        */

        public final String patron;
        Tipos(String s){
            this.patron = s;
        }//construcctor de tipos

    }//cuierre enum
}
