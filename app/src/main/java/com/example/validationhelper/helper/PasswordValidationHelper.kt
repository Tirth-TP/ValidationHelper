package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */
fun EditText.passwordValidationHelper(){
    val password = this.text.toString()
    val passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$"

    if(password.isNotEmpty()) {
        if (password.matches(passwordPattern.toRegex())){
            return
        }else{
            this.error = "Password must contains \n 1 uppercase \n 1 number \n 1 special character \n and min length of 8"
        }
    }else{
        this.error = "This field is required"
    }
}