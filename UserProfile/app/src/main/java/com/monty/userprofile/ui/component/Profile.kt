package com.monty.userprofile.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.monty.userprofile.ui.data.Data
import com.monty.userprofile.ui.data.UserDataModel




@Composable
fun Profile(){
    //Variables acording object class specificate
    val dataList = remember{Data}
    var name :MutableState<String> = remember { mutableStateOf("") }
    var email :MutableState<String> = remember { mutableStateOf("") }
    var  userName:MutableState<String> = remember { mutableStateOf("") }
    var birthdate :MutableState<String> = remember { mutableStateOf("") }
    //Design and Structure
    Column (
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        //Show data about user
          Row(){
              Text(text = "Name: ")
              Text(text = "${dataList[0].Name}")
          }
        Row(){
            Text(text = "Email: ")
            Text(text = "${dataList[0].Email}")
        }
        Row(){
            Text(text = "User Name: ")
            Text(text = "${dataList[0].UserName}")
        }
        Row(){
            Text(text = "Birthdate: ")
            Text(text = "${dataList[0].Birthdate}")
        }
    }
}