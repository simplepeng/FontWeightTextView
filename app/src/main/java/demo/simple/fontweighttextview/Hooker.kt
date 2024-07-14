package demo.simple.fontweighttextview

import android.graphics.Typeface
import android.os.Build
import android.util.Log
import android.widget.TextView
import top.canyie.pine.Pine
import top.canyie.pine.callback.MethodHook

object Hooker {

    private const val TAG = "Hooker"

    fun hook() {
        hookSetTypeface()
    }

    fun hookSetTypefaceFromAttrs() {
        Pine.hook(TextView::class.java.getDeclaredMethod(
            "setTypefaceFromAttrs",
            Typeface::class.java,
            String::class.java,
            Int::class.java,
            Int::class.java,
            Int::class.java,
        ), object : MethodHook() {
            override fun beforeCall(callFrame: Pine.CallFrame?) {
                super.beforeCall(callFrame)
                Log.d(TAG, "beforeCall: ")
            }

            override fun afterCall(callFrame: Pine.CallFrame?) {
                super.afterCall(callFrame)
                Log.d(TAG, "afterCall: ")
            }
        })
    }

    fun hookResolveStyleAndSetTypeface() {
        Pine.hook(TextView::class.java.getDeclaredMethod(
            "resolveStyleAndSetTypeface",
            Typeface::class.java,
            Int::class.java,
            Int::class.java,
        ), object : MethodHook() {
        })
    }

    fun hookSetTypeface() {
        Pine.hook(TextView::class.java.getDeclaredMethod(
            "setTypeface",
            Typeface::class.java,
        ), object : MethodHook() {
            override fun beforeCall(callFrame: Pine.CallFrame?) {
                super.beforeCall(callFrame)
                Log.d(TAG, "beforeCall: ------------------------")
                printWeight(callFrame)
            }

            override fun afterCall(callFrame: Pine.CallFrame?) {
                super.afterCall(callFrame)
                Log.d(TAG, "afterCall: ------------------------")
                printWeight(callFrame)
            }
        })
    }

    private fun printWeight(callFrame: Pine.CallFrame?) {
        callFrame?.let {
            if (it.thisObject is WeightPrinterTextView) {
                it.args.firstOrNull()?.let {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                        val weight = (it as Typeface).weight
                        Log.d(TAG, "weight: $weight")
                    }
                }
            }
        }
    }

    fun hookSetTypefaceWithInt() {
        Pine.hook(TextView::class.java.getDeclaredMethod(
            "setTypeface",
            Typeface::class.java,
            Int::class.java,
        ), object : MethodHook() {
            override fun beforeCall(callFrame: Pine.CallFrame?) {
                super.beforeCall(callFrame)
                Log.d(TAG, "beforeCall: ")
            }

            override fun afterCall(callFrame: Pine.CallFrame?) {
                super.afterCall(callFrame)
                Log.d(TAG, "afterCall: ")
            }
        })
    }
}