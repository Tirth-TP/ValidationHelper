package com.example.validationhelper.helper

import android.widget.EditText

/**
 * Created by Tirth Patel.
 */

fun EditText.phoneValidationHelper() {
    val phone: String = this.text.toString()
    val mobilePattern = "[0-9]{10}"
    if (phone.isNotEmpty()) {
        if (phone.matches(mobilePattern.toRegex())) {
            return
        } else {
            this.error = "Please enter valid 10 digit phone number"
        }
    } else {
        this.error = "This field is required"
    }
}