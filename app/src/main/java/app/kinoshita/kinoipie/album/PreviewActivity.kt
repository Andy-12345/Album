package app.kinoshita.kinoipie.album

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

    val imageId = intent.getIntExtra("image", 0)
    val displayTitle= intent.getStringExtra("title")
        previewimage.setImageResource(imageId)
        titleText.text = displayTitle
        buckButton.setOnClickListener {


            finish()
        }




    }



}