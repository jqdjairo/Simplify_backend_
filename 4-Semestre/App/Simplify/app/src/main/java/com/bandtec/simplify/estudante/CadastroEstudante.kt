package com.bandtec.simplify.estudante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.bandtec.simplify.R
import com.bandtec.simplify.conexaoApiEstudante.ConexaoEstudanteApi
import com.bandtec.simplify.conexaoApiEstudante.Estudante
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CadastroEstudante : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_estudante)
    }

    fun back(view: View) {}

    fun cadastra(view: View) {

        val nome : EditText = findViewById(R.id.edtNomecad)

        val ra =  "123444"

        val email :EditText = findViewById(R.id.edtmail)

        val senha :EditText = findViewById(R.id.edtsenhacad)

        val cpf ="as"

        val rg ="as"

        val nomeResponsavel = "eu"

        val dataNascimento = "2021-04-16"

        val telefone = "asa"

        val foto = "asa"

        val users = Estudante( null, nome.text.toString(), ra, email.text.toString(),  senha.text.toString(), cpf, rg, nomeResponsavel, dataNascimento, telefone, foto )
            println(users)
        ConexaoEstudanteApi.criar().cadastro(users).enqueue(object :
            Callback<Void> {
            override fun onResponse(call: Call<Void>, response: Response<Void>) {

                val statusCode = response.code()
                println("MEN" + statusCode)

                if (statusCode.equals(201)) {
                    Toast.makeText(this@CadastroEstudante, "Cadatro feito com sucesso!", Toast.LENGTH_SHORT).show()
                    println("XERECA DOIDA")
                } else {
                    Toast.makeText(this@CadastroEstudante, "erro no Cadatro!", Toast.LENGTH_SHORT).show()
                    println("Erro cadastro")
                }

            }

            override fun onFailure(call: Call<Void>, t: Throwable) {
                println("Fodeu" + t)
            }
        })
    }
}