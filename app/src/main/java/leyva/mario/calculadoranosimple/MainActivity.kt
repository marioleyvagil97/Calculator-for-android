package leyva.mario.calculadoranosimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var opcion: Int = 0
    var resultado: Double = 0.0
    var numero1: String =""
    var numero2: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnResultado.setOnClickListener{
            resultado()
        }

        btnClear.setOnClickListener{
            clear()
        }

        btnS.setOnClickListener{
            opcion = 1
            tvOperacion.setText("+")
        }

        btnR.setOnClickListener{
            opcion = 2
            tvOperacion.setText("-")
        }
        btnD.setOnClickListener{
            opcion = 3
            tvOperacion.setText("/")
        }
        btnM.setOnClickListener{
            opcion = 4
            tvOperacion.setText("*")
        }

        btn0.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "0"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "0"
                tvNum1.setText(numero1)
            }
        }
        btn1.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "1"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "1"
                tvNum1.setText(numero1)
            }
        }
        btn2.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "2"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "2"
                tvNum1.setText(numero1)
            }
        }
        btn3.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "3"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "3"
                tvNum1.setText(numero1)
            }
        }
        btn4.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "4"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "4"
                tvNum1.setText(numero1)
            }
        }
        btn5.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "5"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "5"
                tvNum1.setText(numero1)
            }
        }
        btn6.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "6"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "6"
                tvNum1.setText(numero1)
            }
        }
        btn7.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "7"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "7"
                tvNum1.setText(numero1)
            }
        }
        btn8.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "8"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "8"
                tvNum1.setText(numero1)
            }
        }
        btn9.setOnClickListener{
            if(opcion!=0){
                numero2 = numero2 + "9"
                tvNum2.setText(numero2)

            }else{

                numero1 = numero1 + "9"
                tvNum1.setText(numero1)
            }
        }


    }

fun resultado() {

    var numeroUno: Double = tvNum1.text.toString().toDouble()
    var numeroDos: Double = tvNum2.text.toString().toDouble()

    if(numeroUno <= 0 || numeroDos <= 0 && opcion == 3){
        Toast.makeText( this,"Don't you even try to do that", Toast.LENGTH_LONG).show()
        clear()
    }else {

        when (opcion) {
            1 -> resultado = numeroUno + numeroDos
            2 -> resultado = numeroUno - numeroDos
            3 -> resultado = numeroUno / numeroDos
            4 -> resultado = numeroUno * numeroDos
        }

        tvNum1.setText("$resultado")
        tvNum2.setText("")
        numero1 = ""
        numero2 = ""
        opcion = 0
    }
}


fun clear(){
    tvNum1.setText("")
    tvNum2.setText("")
    opcion=0
    tvOperacion.setText("")
    numero1 = ""
    numero2 = ""
}


}
