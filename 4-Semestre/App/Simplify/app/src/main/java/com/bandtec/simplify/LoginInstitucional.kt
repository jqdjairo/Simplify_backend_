package com.bandtec.simplify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bandtec.simplify.faculdade.HomeFaculdade
import com.bandtec.simplify.professor.HomeProfessor

class LoginInstitucional : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_institucional)

    }

    val professor:Boolean = false;

    fun back(view: View) {
        startActivity(Intent(this@LoginInstitucional, HomeInstitucional::class.java))
    }

    fun navegarPerfil(view: View) {
        if(professor == true){
            startActivity(Intent(this@LoginInstitucional, HomeProfessor::class.java))
        } else {
            startActivity(Intent(this@LoginInstitucional, HomeFaculdade::class.java))
        }
    }
}