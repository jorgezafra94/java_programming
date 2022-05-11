package Primitives;

public class CharPrimitive {
    /*
    * los char son numeros que se representan de 0 - (2^16 - 1) y estos son siempre positivos
    * utiliza el mapeo UNICODE y usa el UTF-16 que quiere decir la representacion de un caracter
    * en formato de 16 bits
    */

    char x = 'B';
    /*
    * en el anterior ejemplo tenemos el caracter B este puede ser representado en numero con 66
    * esto lo podemos obtener por la tabla ASCII aunque tambien podemos crear un char a partir de
    * su code point que es un valor hexadecimal, tambien conocido como unicode scape sequence
    */

    char y = 66; // B
    char z = '\u0042'; // B

    /*
    * para ver el unicode scape sequence de otros char podemos dirigirnos a unicode-table.com
    */
}
