package br.senai.sp.jandira.caixadetexo

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.caixadetexo.ui.theme.CaixaDeTexoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaixaDeTexoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .height(200.dp)
                .padding(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Yellow)
        ){
            Column (
                modifier = Modifier.padding(8.dp)
            ){
                OutlinedTextField(
                    leadingIcon = {
                                  Icon(
                                      imageVector = Icons.Default.Add,
                                      contentDescription = ""
                                  )
                    },
                    value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedTextColor = Color.White,
                        focusedTextColor = Color.Yellow,
                        unfocusedBorderColor = Color.Red,
                        focusedBorderColor = Color.Green
                        ),
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "nome do usuário")
                    }
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Build,
                            contentDescription = ""
                        )
                    }
                )
                Button(onClick = { /*TODO*/ }) {
                    
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CaixaDeTexoTheme {
        Greeting()
    }
}