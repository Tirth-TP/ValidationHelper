package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */
fun passwordValidationHelper(editText: EditText){
    val password = editText.text.toString()
    val passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$"

    if(password.isNotEmpty()) {
        if (password.matches(passwordPattern.toRegex())){
            return
        }else{
            editText.error = "Password must contains \n 1 uppercase \n 1 number \n 1 special character \n and min length of 8";
        }
    }else{
        editText.error = "This field is required";
    }
}