package com.example.pokemonselector

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun showMsg(title: String, msg: String, ctx: Context) {
    AlertDialog.Builder(ctx)
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("Okay", null)
        .create()
        .show()
}