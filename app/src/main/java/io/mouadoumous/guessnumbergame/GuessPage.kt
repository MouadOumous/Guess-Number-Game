package io.mouadoumous.guessnumbergame
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.AlertDialog
import android.content.DialogInterface
import android.view.View
import io.mouadoumous.guessnumbergame.databinding.ActivityGuessPageBinding


class GuessPage : AppCompatActivity() {

    lateinit var binding : ActivityGuessPageBinding

    var numberAttempts: Int = 0

    lateinit var generator : NumberGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuessPageBinding.inflate(layoutInflater);
        var view = binding.root;
        setContentView(view);
        val intent = getIntent();
        val maximumValueSelected = intent.getStringExtra("valueBtn")

        if (maximumValueSelected != null) {
            generator = NumberGenerator(maximumValueSelected.toInt())
        }
        generator.generate()

        binding.textCenter2.setText(" I am thinking of a number between 1 and " + maximumValueSelected + ".")

        val actionBar = supportActionBar
        actionBar!!.title = "Back to the main page"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        binding.checkMessage.setText("")


        binding.btnCheckValue.setOnClickListener {

            numberAttempts++

            if(binding.valueTextView.text.toString().trim().length > 0) {

                val valueToCheck: Int = binding.valueTextView.text.toString().toInt()

                if(valueToCheck == generator.getNumber())
                {
                    binding.checkMessage.setText("Congratulations. You guessed my number from " + numberAttempts +  " attempts!")


                }else if(valueToCheck > generator.getNumber())
                {
                    binding.checkMessage.setText("Your guess is too high. " + numberAttempts +  " attempts!")
                    binding.valueTextView.setText("")
                }
                else
                {
                    binding.checkMessage.setText("Your guess is too low. " + numberAttempts +  " attempts!")
                    binding.valueTextView.setText("")
                }
            }else{

                val dialogBuilder = AlertDialog.Builder(this)
                dialogBuilder.setMessage("Please chosse a Number between 1 and " + maximumValueSelected)
                    .setCancelable(false)
                    .setNegativeButton("OK", DialogInterface.OnClickListener {
                            dialog, id -> dialog.cancel()
                    })
                val alert = dialogBuilder.create()
                alert.setTitle("Message")
                alert.show()
            }
        }

        binding.generateNewNumber.setOnClickListener {
            if (maximumValueSelected != null) {
                generator.generate();
            }
            numberAttempts = 0
            binding.checkMessage.setText("")
            binding.valueTextView.setText("")

            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("A new random number has been generated")
                .setCancelable(false)
                .setNegativeButton("OK", DialogInterface.OnClickListener {
                        dialog, id -> dialog.cancel()
                })
            val alert = dialogBuilder.create()
            alert.setTitle("Message")
            alert.show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}