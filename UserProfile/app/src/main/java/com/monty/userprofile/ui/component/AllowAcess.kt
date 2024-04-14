package com.monty.userprofile.ui.component

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.monty.userprofile.ui.data.Data
import com.monty.userprofile.ui.data.UserDataModel
import androidx.navigation.NavController
import com.monty.userprofile.ui.navigate.navigation

//Function AllowAcess has the design of Login and their function
@Composable
fun AllowAcess(navController: NavController){
    val dataList = remember{Data}
    //Variables acording object class specificate
    var name :MutableState<String> = remember { mutableStateOf("") }
    var email :MutableState<String> = remember { mutableStateOf("") }
    var  userName:MutableState<String> = remember { mutableStateOf("") }
    var birthdate :MutableState<String> = remember { mutableStateOf("") }

      //Design and Structure
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
             text="Name"
        )
       OutlinedTextField(
            value = name.value,onValueChange = { name.value = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
                capitalization = KeyboardCapitalization.Sentences,
                autoCorrect = true
            )
        )
        Text(
            text="Email"
        )
        OutlinedTextField(
            value = email.value,onValueChange = { email.value = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
                capitalization = KeyboardCapitalization.Sentences,
                autoCorrect = true
            )
        )
        Text(
            text="User Name"
        )
        OutlinedTextField(
            value = userName.value,onValueChange = { userName.value = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
                capitalization = KeyboardCapitalization.Sentences,
                autoCorrect = true
            )
        )
        Text(
            text="Birthdate"
        )
        OutlinedTextField(
            value = birthdate.value,onValueChange = { birthdate.value = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done,
                capitalization = KeyboardCapitalization.Sentences,
                autoCorrect = true
            )
        )
        //Capture information and push into de object list
        //Change to the other Window(Profile)
        Button(
            onClick = {
                    Data.add(UserDataModel(name.value,email.value,userName.value,birthdate.value))
              navController.navigate(route = navigation.Profile_.route)
            }
        ) {
            Text("Log in")
        }



    }

}


