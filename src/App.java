public class App {

    private String nombre; 
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;
    private String direccionVivienda;

    public static void main(String[] args) throws Exception {
        //Operadores aritmeticos
        int resultado = 5 + 4;
        double resultado2 = 5 / 4;
        double resultado3 = 12 % 4;
        resultado++;
        resultado = resultado + 1;
        resultado--;
        resultado = -resultado;
        resultado = +resultado;
        //Operadores lógicos
        boolean respuesta = 5 > 4;
        respuesta  = 25 != 12;
        respuesta = true;
        respuesta = 15 > 12 && 5 < 2;
        respuesta = 15 > 12 || 5 < 2;
        //Operadores Bit a bit
        //&
        //^
        //|
        //---------------------
        //Estructuras de control
        if (respuesta) {
            //resultado si se cumple la condición
        }
        if (respuesta) {
            //resultado si se cumple la condición
        } else {
            //resultado si no se cumple la condición
        }
        int valor = 3;
        switch (valor) {
            case 1:
                //bloque de código
                break;
            case 2:
                //bloque de código
                break;
            case 3:
                //bloque de código
                break;
        
            default:
                break;
        }
        //Ciclos o bucles
        while (valor != 3) {
            //bloque de código
        }
        do {
            //bloque de código
        } while (valor != 3);
        for (String string : args) {
            //bloque de código
        }
        for (int i = 0; i < args.length; i++) {
            //bloque de código
        }
        for(;;){}//for infinito
        
    }
}
