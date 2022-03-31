package org.d3if4037.hitungpersegipanjang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if4037.hitungpersegipanjang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{hitungPersegi()}
        binding.resetButton.setOnClickListener{ulang()}

    }
    private fun hitungPersegi(){
        val panjang = binding.panjangPersegiInp.text.toString()
        if(TextUtils.isEmpty(panjang)){
            Toast.makeText(this, R.string.panjang_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val lebar = binding.lebarPersegiInp.text.toString()
        if(TextUtils.isEmpty(lebar)){
            Toast.makeText(this, R.string.lebar_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val hasil = panjang.toDouble() * lebar.toDouble()
        binding.hasilTextView.text = getString(R.string.hasil_x, hasil)

    }
    private fun ulang(){
        binding.panjangPersegiInp.text = null
        binding.lebarPersegiInp.text = null
        binding.hasilTextView.text = null
    }
}