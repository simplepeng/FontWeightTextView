package demo.simple.fontweighttextview

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val tvAndroid: TextView by lazy { findViewById<TextView>(R.id.tvAndroid) }

    companion object {
        const val TAG = "MainActivity"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        Hooker.hook()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bindAndroidVersion()

        findViewById<View>(R.id.textView1).setOnClickListener {
            val isAppCompatTextView = it is AppCompatTextView
            Log.d(TAG, "isAppCompatTextView: $isAppCompatTextView")
        }
    }

    private fun bindAndroidVersion() {
        val versionName = Build.VERSION.RELEASE // 获取系统版本名称
        val sdkInt = Build.VERSION.SDK_INT      // 获取系统API级别
        val versionText = "Android version: $versionName (API Level: $sdkInt)"
        tvAndroid.text = versionText
    }
}