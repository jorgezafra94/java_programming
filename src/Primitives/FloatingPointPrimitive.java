package Primitives;

import java.math.BigDecimal;

public class FloatingPointPrimitive {
    /*
    * float -> 32bits -> -3.4E38 - 3.4E38 -> 0.0f default -> precision 6-7 decimals
    * double -> 64bits -> -1.7E308 - 1.7E308 -> 0.0 default -> precision 15-16 decimals
    */

    float f1 = 898.234f; // SIEMPRE toca usar "f2 al final del numero para decir que es float sino lo toma como double

    double d1 = 898.234; // se puede usar "d" al final pero no es necesario

    // si un numero supera la cantidad de decimales de precision lo que va a pasar es que va a redondear el ultimo decimal

    float f2 = 2.3123123123123123123123f;

    /*
    * NOTA IMPORTANTE:
    * Si se necesita precision es mejor usar la clase bigdecimal
    * y NO usar ni float ni double
    *
    * Normalmente el error ocurre con los decimales cuya representacion en
    * fraccionario no tiene un denominador POTENCIA de 2
    *
    * por ejemplo:
    * 0.1 -> 1 /10 -> 10 no es potencia de 2 por ende 0.1 no puede ser representado
    *                 exactamente, sino que se va representar con roundings
    * 0.5 -> 5/10 -> 1/2 -> 2 si es potencia de 2 por ende este numero si va a poder
    *                       representarse de manera exacta
    */

    BigDecimal number = new BigDecimal("0.1"); // este si lo va a poder representar correctamente
}
