package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */

fun phoneValidationHelper(editText: EditText) {
    val phone: String = editText.text.toString()
    val mobilePattern = "[0-9]{10}"
    if (phone.isNotEmpty()) {
        if (phone.matches(mobilePattern.toRegex())) {
            return
        } else {
            editText.error = "Please enter valid 10 digit phone number"
        }
    } else {
        editText.error = "This field is required"
    }
}