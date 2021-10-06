package com.example.guia_de_ejercicios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ejercicio1();
        Ejercicio2(7);
        clases();

    }

    private fun clases() {
        var emplead = Empleado("Jacqueline",
            800.5,"Programador", "Director de tecnologia", 10)
        println(emplead)
        emplead.InformacionSueldo()

        var valoe = Dado(7)
        println(valoe)
        valoe.num()
        valoe.aleatorio()

    }

    private fun Ejercicio2(numero:Int) {

        for (i in 1..10){
            var tabla=i*numero
            println("$i * $numero = $tabla")
        }
    }

    private fun Ejercicio1() {
        val operario = "Jacqueline Robles";
        val pagohora = 5;
        val horastrabajadas = 8;
        val horasextras =3;

        val totalhorasextra = (2 * pagohora) * horasextras;
        val sueldodiario = (pagohora * horastrabajadas) + totalhorasextra;
        val sueldomensual = (sueldodiario * 30);
        println("El nombre del oprario es: $operario y el sueldo de dicho operario es: $$sueldodiario el sueldo mensual es: $$sueldomensual");
    }

}