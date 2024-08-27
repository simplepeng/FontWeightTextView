package demo.simple.fontweighttextview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class WeightPrinterTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    init {
        if (attrs == null) {
            Log.d("", "attr is null")
        }
    }
}