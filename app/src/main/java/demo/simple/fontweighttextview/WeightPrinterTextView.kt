package demo.simple.fontweighttextview

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView

class WeightPrinterTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : TextView(context, attrs) {

    init {
        if (attrs == null) {
            Log.d("", "attr is null")
        }
    }
}