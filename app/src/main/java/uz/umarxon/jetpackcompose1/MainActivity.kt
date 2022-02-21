package uz.umarxon.jetpackcompose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Jetpack Compose 1")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Cyan),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier.background(Color.Yellow).height(40.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}

@Preview
@Composable
fun Show(){
    Greeting("Murodhonov Umarxon")
}