package com.example.validationhelper.helper

import android.widget.EditText
import java.util.regex.Pattern

/**
 * Created by Tirth Patel.
 */

fun EditText.emailValidationHelper() {
    val email = this.text.toString()
//    val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    val emailPattern =   Pattern.compile(
         "[a-zA-Z0-9\\-]"+"[a-zA-Z0-9\\+\\.\\!\\_\\%\\-\\+\\#\\$\\&\\'\\*\\/\\=\\?\\^\\`\\{\\|\\}\\~]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )
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
