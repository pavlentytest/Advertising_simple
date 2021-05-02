package ru.myitacademy.samsung.advertising

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.Gravity
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        var res = getResultExtras(true)
        var str = res.getString("strEx")
        Toast.makeText(context,str + " \n" +
                "сделано" + resultCode + "пересылок", Toast.LENGTH_LONG).show()
        Log.d("Control_toast",str)

    }
}
