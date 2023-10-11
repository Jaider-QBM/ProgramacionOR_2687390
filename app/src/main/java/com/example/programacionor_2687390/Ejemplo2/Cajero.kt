package com.example.programacionor_2687390.Ejemplo2

class Cajero {
    val cliente1:Cliente = Cliente("Jaider", 100000f)
    val cliente2:Cliente = Cliente("Maria", 150000f)
    val cliente3:Cliente = Cliente("Pedro", 30000f)

    fun transacciones(){
        cliente1.consignar(20000f)
        cliente2.consignar(10000f)
        cliente3.consignar(100000f)
        cliente3.retirar(150000f)
    }

    fun saldoTotal(){
        val total = cliente1.saldoCuenta + cliente2.saldoCuenta + cliente3.saldoCuenta
        println("El cajero tiene un saldo de : $total")

        cliente1.consultarSaldo()
        cliente2.consultarSaldo()
        cliente3.consultarSaldo()
    }

}