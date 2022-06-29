package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */

fun EditText.emailValidationHelper() {
    val email = this.text.toString()
    val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    if (email.isNotEmpty()) {
        if (email.matches(emailPattern.toRegex())) {
            return
        } else {
            this.error = "Enter valid email"
        }
    } else {
        this.error = "This field is required"
    }
}
