package com.example.taskmanagerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerapp.ui.theme.TaskManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManagerApp()
                }
            }
        }
    }
}

@Composable
fun TaskManagerApp() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalArrangement = Arrangement.Center ,
            horizontalAlignment = Alignment.CenterHorizontally

    ) {
        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(text = stringResource(R.string.task_status),
            fontWeight= FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
            color = Color.Blue
        )
        Text(text = stringResource(R.string.nice_work),
            fontSize= 16.sp,
            color = Color.Red
            )
    }

}

@Preview(showBackground = true)
@Composable
fun TaskManagerAppPreview() {
    TaskManagerAppTheme {
        TaskManagerApp()
    }
}