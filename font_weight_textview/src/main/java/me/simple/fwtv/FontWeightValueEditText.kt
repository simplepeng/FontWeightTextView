package me.simple.fwtv

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.withStyledAttributes

open class FontWeightValueEditText(
    context: Context,
    attrs: AttributeSet? = null
) : FontWeightEditText(context, attrs) {

    init {
        context.withStyledAttributes(attrs, R.styleable.FontWeightValueEditText) {
            if (hasValue(R.styleable.FontWeightValueEditText_et_fontWeightValue)) {
                val fontWeightValue = getInt(R.styleable.FontWeightValueEditText_et_fontWeightValue, 400)
                setFontWeight(fontWeightValue)
            }
        }
    }
}