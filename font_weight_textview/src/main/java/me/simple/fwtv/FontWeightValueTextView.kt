package me.simple.fwtv

import android.content.Context
import android.util.AttributeSet

open class FontWeightValueTextView(
    context: Context,
    attrs: AttributeSet? = null
) : FontWeightTextView(context, attrs) {

    init {
        context.obtainStyledAttributes(attrs, R.styleable.FontWeightValueTextView).run {
            if (hasValue(R.styleable.FontWeightValueTextView_fontWeightValue)) {
                val fontWeightValue = getInt(R.styleable.FontWeightValueTextView_fontWeightValue, 400)
                setFontWeight(fontWeightValue)
            }
            recycle()
        }
    }
}