package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */

fun emptyValidationHelper(editText: EditText){
    val msg: String = editText.text.toString()
    if(msg.trim().isEmpty()){
        editText.error = "This field is required"
    }
}