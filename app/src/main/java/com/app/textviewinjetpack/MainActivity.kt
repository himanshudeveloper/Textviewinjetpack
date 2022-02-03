package com.app.textviewinjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.textviewinjetpack.ui.theme.TextviewInJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextviewInJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    myText()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextviewInJetpackTheme {
       // Greeting("Android")  // = comment out
        myText()
    }
}


@Composable
fun myText(){
    // make a text Variable

    var text = "Hello Devellopers if you want to learn live coding in free please subscribe this channel"
    var text1 = "Hello Devellopers if you want to learn live "
    var text2 = "Hello Devellopers if you want to learn live  this channel"

    val tap = remember{
        mutableStateOf(false)

    }




    Text(text = text2,
    color = Color.Green,
    textAlign = TextAlign.Left,
    fontSize =25.sp,
        fontWeight = FontWeight.Medium,
        overflow = TextOverflow.Visible,
        maxLines = if (tap.value) Int.MAX_VALUE else 1,
        modifier = Modifier.padding(20.dp)
            .clickable {
                tap.value = !tap.value
            }

    )


}