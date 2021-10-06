package com.example.guia_de_ejercicios
import java.util.Random

public class Dado(var valor:Int) {
    public fun num(){
        if (valor > 6 || valor <=0){
            println("1")
        }else{
            println("El numero ingresado es: $valor")
        }

    }
  fun aleatorio(){
      val valor=(1..6).random()
      println("El numero aleatorio del dado es: $valor")
  }

}


