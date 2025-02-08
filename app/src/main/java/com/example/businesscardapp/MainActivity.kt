package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        NameText(
                                name = "Тимур Ямашев",
                                title = "Студент ИжГТУ",
                                modifier = Modifier.padding(8.dp)
                        )
                        Info()
                    }
            }
        }
    }
}

@Composable
fun NameText(name : String, title : String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(color = Color(1,87,86))
            .padding(bottom = 300.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(8.dp)
        ) {
            AndroidLogo(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = name,
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                lineHeight = 38.sp,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = title,
                fontSize = 20.sp,
                color = Color.White,
                lineHeight = 28.sp,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
fun AndroidLogo(modifier : Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Image (
        painter = image,
        contentDescription = null,
        modifier = modifier.size(150.dp)
    )
}

@Composable
fun Info(modifier: Modifier = Modifier) {
    Box (
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .padding(bottom = 300.dp)

    )
    {
        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
                    .padding(8.dp)
            )
            {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 10.dp)
                )
                Text(
                    "+79990001234", fontSize = 20.sp,
                    color = Color.White,
                    lineHeight = 24.sp,
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
                    .padding(8.dp)
            )
            {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 10.dp)
                )
                Text(
                    "github.com/timurkkkk", fontSize = 20.sp,
                    color = Color.White,
                    lineHeight = 24.sp,
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
                    .padding(8.dp)
            )
            {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 10.dp)
                )
                Text(
                    "ytimurik@gmail.com", fontSize = 20.sp,
                    color = Color.White,
                    lineHeight = 24.sp,
                )
            }


        }
    }

}

@Preview(showBackground = true)
@Composable

fun GreetingPreview() {
    BusinessCardAppTheme {
            NameText(
                name = "Тимур Ямашев",
                title = "Студент ИжГТУ",
                modifier = Modifier.padding(8.dp)
            )
            Info()
    }
}