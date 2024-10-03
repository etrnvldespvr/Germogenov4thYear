package com.example.weather2lec

import android.content.Context
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

object DialogManager {
    fun locationSettingsDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle("Включить GPS?")
        dialog.setMessage("GPS выключен, желаете его включить?")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Да"){_,_ ->
            listener.onClick(null)
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Нет"){_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }
    fun searchByNameDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)
        val dialog = builder.create()
        dialog.setTitle("Название города:")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Да"){_,_ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Нет"){_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }
    interface Listener{
        fun onClick(name: String?)
    }
}