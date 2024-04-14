package com.monty.userprofile.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.monty.userprofile.ui.component.Profile

@Composable
fun ProfileView(navController: NavController) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //Call  component Profile  in component
        Profile();
    }

}


/*
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    ProfileView(navController: NavController)
}*/