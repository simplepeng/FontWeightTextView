# FontWeightTextView

让`textFontWeight`属性支持Api29(Android9-p)以下。

| 模拟器 Android5.1            | OnePlus6 Android10           | RedmiK50 Android14           |
| ---------------------------- | ---------------------------- | ---------------------------- |
| ![](files/icon_android5.png) | ![](files/icon_android10.png) | ![](files/icon_android14.png) |

## 导入依赖

```kotlin

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

```

```