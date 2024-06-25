# FontWeightTextView

让`textFontWeight`属性支持Api29(Android9-p)以下。

| 模拟器 Android5.1            | OnePlus6 Android10           | RedmiK50 Android14           |
| ---------------------------- | ---------------------------- | ---------------------------- |
| ![](files/icon_android5.png) | ![](files/icon_android10.png) | ![](files/icon_android14.png) |

## 导入依赖

```kotlin
maven { url 'https://jitpack.io' }
```

```kotlin
implementation("com.github.simplepeng:FontWeightTextView:1.0.0")
```

## 添加FontWeightTextView

```xml
<me.simple.fwtv.FontWeightTextView
    style="@style/WeightTextStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="自定义400"
    app:textFontWeight="400" />
```

`textFontWeight`属性支持`1-1000`的数值。

## 或FontWeightValueTextView

```xml
<me.simple.fwtv.FontWeightValueTextView
    style="@style/WeightTextStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Medium"
    app:fontWeightValue="medium" />
```

`fontWeightValue`支持以下属性：

```xml
<declare-styleable name="FontWeightValueTextView">
    <attr name="fontWeightValue" format="enum">
        <enum name="thin" value="100" />"
        <enum name="extraLight" value="200" />"
        <enum name="light" value="300" />"
        <enum name="normal" value="400" />"
        <enum name="medium" value="500" />"
        <enum name="semiBold" value="600" />"
        <enum name="bold" value="700" />"
        <enum name="extraBold" value="800" />"
        <enum name="black" value="900" />"
    </attr>
</declare-styleable>
```

## 版本发布

* v1.0.0 - 首次发布