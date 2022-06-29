package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */

fun emailValidationHelper(editText: EditText) {
    val email = editText.text.toString()
    val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    if (email.isNotEmpty()) {
        if (email.matches(emailPattern.toRegex())) {
            return
        } else {
            editText.error = "Enter valid email"
        }
    } else {
        editText.error = "This field is required"
    }
}
