

/* Copie el siguiente código y muestre los valores en una sola línea, precediendo una
cadena descriptiva ante cada variable */
fun main()
{
    //numeros
val int = 123
val long = 123456L
val double = 12.34
val float = 12.34F
val hexadecimal = 0xAB
val binary = 0b01010101

println("int $int, long $long, double $double, float $float, hexadecimal $hexadecimal, binary $binary")
println(int)

//cadenas
val string = "string con \n una línea nueva"
val rawString = """
 raw string es útil para
 cadenas con muchas líneas
 """
println(" $string $rawString")

}

