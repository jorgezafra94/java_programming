package Primitives;

public class IntegerPrimitive {
    /*
    * byte -> 8bits -> -2^7 to ((2^7) - 1) -> default value 0
    * short -> 16bits -> -2^15 to ((2^15) - 1) -> default value 0
    * int -> 32bits -> -2^31 to ((2^31) - 1) -> default value 0
    * long -> 64bits -> -2^63 to ((2^63) - 1) -> default value 0
    */

    byte b1 = 18;
    //byte b2 = 129; -> genera un error porque sobre pasa los limites de un byte

    short s1 = 129;
    //short s2 = 32768; -> genera error porque sobre pasa los limites de un short

    int i1 = 32768;

    long l1 = 32768;
    long l2 = 3123123L;

    /* se puede agregar _ a los numeros para que se puedan leer mejor, y esta forma no causa ningun error no mas es visual
    * aplica para todos los tipos, en especial los int y los long ya que tienen numeros grandes.
    * */

    int i2 = 234234234;
    int i3 = 234_234_234;
}
