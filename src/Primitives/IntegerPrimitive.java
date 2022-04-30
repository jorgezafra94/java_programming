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

    long l1 = 32768; // esto se conoce como int literal, lo usan byte, int, short y long
    long l2 = 3123123L; // esto se conoce como long literal ya que lleva la L, solo lo pueden usar los long

    /* se puede agregar _ a los numeros para que se puedan leer mejor, y esta forma no causa ningun error no mas es visual
    * aplica para todos los tipos, en especial los int y los long ya que tienen numeros grandes.
    * */

    int i2 = 234234234;
    int i3 = 234_234_234;

    /* podemos obtener los valores limites de cada uno de estos primitivos de la siguiente forma
    *  usando las CLASES WRAPPER o BOXING class de las primitivas
    * */

    byte minByte = Byte.MIN_VALUE;
    byte maxByte = Byte.MAX_VALUE;

    short minShort = Short.MIN_VALUE;
    short maxShort = Short.MAX_VALUE;

    int minInt = Integer.MIN_VALUE;
    int maxInt = Integer.MAX_VALUE;

    long minLong = Long.MIN_VALUE;
    long maxLong = Long.MAX_VALUE;

    /* podemos escribir un numero de diferentes formas como hexadecimal, octal, binario */
    int intHex = 0x0041;
    long longHex = 0x0041; // tambien puede ser 0x0041L
    int intBinary = 0b01000001;
    int octal = 0101; // para octal solo es necesario empezar con 0 y luego seguir con el numero en octal
}
