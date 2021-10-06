package com.example.guia_de_ejercicios

class Empleado(var nombre:String, var sueldo:Double, var area:String, var cargo:String, var tiempotrabajo:Int) {
    fun InformacionSueldo(){
        if(sueldo<0){
            println("No se permiten sueldos negativos")
        }else if(area.isEmpty() || cargo.isEmpty()){
           println("¡Se deben llenar los campos de area y cargo!")
        }else{
            var sueldoExtra:Int=(25*tiempotrabajo)/5
            var sueldoTotal = sueldoExtra+sueldo
            println("Nombre: $nombre, Su tiempo de trabajo es: $tiempotrabajo, Sueldo es: $$sueldo, El sueldo total por su tiempo de trabajo es: $$sueldoTotal");
        }
    }
}