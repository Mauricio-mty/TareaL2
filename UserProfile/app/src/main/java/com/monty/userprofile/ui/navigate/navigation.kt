package com.monty.userprofile.ui.navigate

//Object assigned a nickname to navigate between views
sealed class navigation (var route: String){
    object LogIn_: navigation("LogIn")
    object Profile_: navigation("Profile")

}