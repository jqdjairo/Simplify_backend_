package com.bandtec.simplify.estudante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.bandtec.simplify.R

class EstudanteEnvioDocumentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estudante_envio_documentos)

        val mySpinner : Spinner = findViewById(R.id.spinner_documents_pending)

        ArrayAdapter.createFromResource(
            this,
            R.array.documentos,
            android.R.layout.simple_spinner_item
        ).also{ adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            mySpinner.adapter = adapter
        }
    }

    fun back(view: View) {
        onBackPressed()
    }
}