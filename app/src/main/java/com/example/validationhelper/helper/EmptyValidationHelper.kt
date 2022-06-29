package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */

fun EditText.emptyValidationHelper(){
    val msg: String = this.text.toString()
    if(msg.trim().isEmpty()){
        this.error = "This field is required"
    }
}