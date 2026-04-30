package com.example.actividades

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.actividades.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySecondaryBinding.inflate(layoutInflater)

        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bundle = intent.extras

        binding.tvwName.text = bundle?.getString("USER_NAME")
        binding.txtEstudiante.text = bundle?.getBoolean("IS_STUDENT").toString()
        binding.txtEDAD.text = bundle?.getInt("EDAD").toString()
    }
}