package net.leifanderson.mobile.android.easybutton

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.leifanderson.mobile.android.easybutton.ui.theme.EasyButtonTheme

class EasyButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.easy_button_layout)
        (findViewById<View>(R.id.easy_button_layout) as ImageButton).setOnClickListener {
            val leMediaPlayer = MediaPlayer.create(this@EasyButtonActivity.applicationContext, R.raw.easy)
            leMediaPlayer.start()
            leMediaPlayer.setOnCompletionListener{
                leMediaPlayer.release()
            }
        }
    }
}
