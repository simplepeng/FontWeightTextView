package me.simple.fwtv

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.IntRange
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.graphics.TypefaceCompat

open class FontWeightTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    companion object {
        private const val FONT_WEIGHT_UNSPECIFIED = -1
    }

    private var mFontWeight = FONT_WEIGHT_UNSPECIFIED

    init {
        context.obtainStyledAttributes(attrs, R.styleable.FontWeightTextView).run {
            if (hasValue(R.styleable.FontWeightTextView_android_textFontWeight)) {
                mFontWeight = getInt(R.styleable.FontWeightTextView_android_textFontWeight, FONT_WEIGHT_UNSPECIFIED)
            } else if (hasValue(R.styleable.FontWeightTextView_textFontWeight)) {
                mFontWeight = getInt(R.styleable.FontWeightTextView_textFontWeight, FONT_WEIGHT_UNSPECIFIED)
            }
            recycle()
        }

        innerSetFontWeight()
    }

    private fun innerSetFontWeight() {
        if (mFontWeight == FONT_WEIGHT_UNSPECIFIED)
            return

        setFontWeight(mFontWeight)
    }

    fun getFontWeight() = mFontWeight

    fun setFontWeight(
        @IntRange(from = 100, to = 1000) weight: Int
    ) {
        mFontWeight = weight
        TypefaceCompat.create(context, typeface, weight, typeface.isItalic).let {
            typeface = it
        }
    }
}