package io.mouadoumous.guessnumbergame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.mouadoumous.guessnumbergame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnValue10.setOnClickListener{
            val activityGuess = Intent(this,GuessPage::class.java)
            activityGuess.putExtra("valueBtn", "10")
            startActivity(activityGuess);
        }

        binding.btnValue50.setOnClickListener{
            val activityGuess = Intent(this,GuessPage::class.java)
            activityGuess.putExtra("valueBtn", "50")
            startActivity(activityGuess);
        }

        binding.btnValue100.setOnClickListener{
            val activityGuess = Intent(this,GuessPage::class.java)
            activityGuess.putExtra("valueBtn", "100")
            startActivity(activityGuess);
        }


    }
}