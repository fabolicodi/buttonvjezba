package hr.fabolicodi.buttonvjezba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import hr.fabolicodi.buttonvjezba.databinding.ActivityMainBinding
import hr.fabolicodi.buttonvjezba.databinding.ActivityRajcicaactivityBinding

class rajcicaactivity : AppCompatActivity() {
    lateinit var binding: ActivityRajcicaactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRajcicaactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}