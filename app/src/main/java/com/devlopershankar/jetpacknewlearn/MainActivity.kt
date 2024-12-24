package com.devlopershankar.jetpacknewlearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devlopershankar.jetpacknewlearn.ui.theme.JetPacknewLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPacknewLearnTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    NavHostApp()
                }
            }
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun test() {
//
//    Box(
//        modifier = Modifier.fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ){
//        Card(
//            modifier = Modifier.fillMaxWidth().padding(16.dp),
//        ) {
//            Column(
//                modifier = Modifier.fillMaxWidth().padding(16.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//
//                Text(text = "Hello Learn Jetpack", fontSize = 24.sp, fontWeight = FontWeight.Bold)
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Image(painter = painterResource(id = R.drawable.logo),
//                    contentDescription = "",
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.size(100.dp).clip(RoundedCornerShape(10.dp))
//
//                )
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(8.dp)
//
//                ) {
//                    Button(
//                        onClick = {},
//                        modifier = Modifier.weight(1f)
//                    ) {
//                        Text(text="Share")
//                    }
//
//                    Button(
//                        onClick = {},
//                        modifier = Modifier.weight(1f)
//                    ) {
//                        Text(text="Save")
//                    }
//
//                }
//
//            }
//        }
//    }


//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    ){
//        Text(text="Hello World")
//        Text(text = "Welcome to Jetpack Compose learn")
//    }



//}
