package com.binding.twowaybinding

import android.content.Context
import android.widget.Toast

class Example {

    object ToastMessage {

        fun makeToast(context: Context) {

            Toast.makeText(context, "SampleToast", Toast.LENGTH_SHORT).show()

        }

    }

}