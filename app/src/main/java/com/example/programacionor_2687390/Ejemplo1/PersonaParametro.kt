package com.example.programacionor_2687390.Ejemplo1

class PersonaParametro (var nombre:String,var Apellido:String,var Edad:Int ){
    fun imprimir(){
        println("nombre: $nombre $Apellido, tiede $Edad años")
    }

    fun ingresa(){
        if(Edad>=18){
            println("Es mayor de edad, ¡Puede ingresar!")
        } else{
            println("Es menor de edad, ¡No puedes ingresar!")
        }
    }
}