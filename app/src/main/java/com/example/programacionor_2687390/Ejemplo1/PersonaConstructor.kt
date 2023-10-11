package com.example.programacionor_2687390.Ejemplo1

class PersonaConstructor (nombre:String, apellido:String, edad:Int){
    var nombre:String = nombre
    var apellido:String = apellido
    var edad:Int = edad

    fun imprimir(){
        println("nombre: $nombre $apellido, tiede $edad años")
    }

    fun ingresa(){
        if(edad>=18){
            println("Es mayor de edad, ¡Puede ingresar!")
        } else{
            println("Es menor de edad, ¡No puedes ingresar!")
        }
    }
}