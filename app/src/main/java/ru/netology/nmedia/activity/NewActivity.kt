package ru.netology.nmedia.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import ru.netology.nmedia.databinding.CardPostBinding

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = CardPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Snackbar.make(
            binding.root, intent?.getIntExtra(KEY_VALUE, 0)?.toString() ?: "",
            Snackbar.LENGTH_INDEFINITE
        ).setAction("OK") {
            setResult(RESULT_OK, Intent().apply { putExtra(KEY_RETURN, "Hello") })
            finish()
        }.show()
    }

    companion object {
        const val KEY_VALUE = "value"
        const val KEY_RETURN = "return"
    }
}