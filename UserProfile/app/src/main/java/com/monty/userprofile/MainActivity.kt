package com.monty.userprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.monty.userprofile.ui.theme.UserProfileTheme
import com.monty.userprofile.ui.screen.LogIn
import com.monty.userprofile.ui.navigate.AppNavigate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Redirect to AppNavigate f(x)
           AppNavigate();
        }
    }
}


