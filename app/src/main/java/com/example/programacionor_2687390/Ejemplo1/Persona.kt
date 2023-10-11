package com.example.programacionor_2687390.Ejemplo1

class Persona {
    var nombre:String = ""
    var Apellido:String = ""
    var Edad:Int = 0

    fun inicializar(nombre:String, apellido:String, Edad:Int){
        this.nombre = nombre
        this.Apellido = apellido
        this.Edad = Edad
    }

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