package com.example.programacionor_2687390.Ejemplo2

class Cliente (var nombre:String, var saldoCuenta:Float) {

    fun consignar(valor:Float){
        this.saldoCuenta += valor;
    }

    fun retirar(valor: Float){
        this.saldoCuenta -= valor;
    }

    fun consultarSaldo(){
        println("$nombre - saldo $saldoCuenta")
    }


}