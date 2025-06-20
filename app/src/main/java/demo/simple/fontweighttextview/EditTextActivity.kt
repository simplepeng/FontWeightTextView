package demo.simple.fontweighttextview

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EditTextActivity : AppCompatActivity() {

    private val tvAndroid: TextView by lazy { findViewById<TextView>(R.id.tvAndroid) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
        bindAndroidVersion()
    }

    private fun bindAndroidVersion() {
        val versionName = Build.VERSION.RELEASE // 获取系统版本名称
        val sdkInt = Build.VERSION.SDK_INT      // 获取系统API级别
        val versionText = "Android version: $versionName (API Level: $sdkInt)"
        tvAndroid.text = versionText
    }
}