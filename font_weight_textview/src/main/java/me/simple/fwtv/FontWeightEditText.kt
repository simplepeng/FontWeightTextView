package me.simple.fwtv

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.IntRange
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.graphics.TypefaceCompat
import androidx.core.content.withStyledAttributes

open class FontWeightEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatEditText(context, attrs) {

    companion object {
        private const val FONT_WEIGHT_UNSPECIFIED = -1
    }

    private var mFontWeight = FONT_WEIGHT_UNSPECIFIED

    init {
        context.withStyledAttributes(attrs, R.styleable.FontWeightEditText) {
            if (hasValue(R.styleable.FontWeightEditText_android_textFontWeight)) {
                mFontWeight = getInt(R.styleable.FontWeightEditText_android_textFontWeight, FONT_WEIGHT_UNSPECIFIED)
            } else if (hasValue(R.styleable.FontWeightEditText_et_fontWeight)) {
                mFontWeight = getInt(R.styleable.FontWeightEditText_et_fontWeight, FONT_WEIGHT_UNSPECIFIED)
            }
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
        @IntRange(from = 1, to = 1000) weight: Int
    ) {
        mFontWeight = weight
        TypefaceCompat.create(context, typeface, weight, typeface.isItalic).let {
            typeface = it
        }
    }
}