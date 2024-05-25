# Retrofit2

-keepclassmembers class * implements android.os.Parcelable {
    static ** CREATOR;
}

-keepclasseswithmembers class * {
    @retrofit2.*.* <methods>;
}
-keepclassmembernames interface * {
    @retrofit2.*.* <methods>;
}
-keep class retrofit.** { *; }
# GSON Annotations
-keepclassmembers,allowobfuscation class * {
  @com.google.gson.annotations.SerializedName <fields>;
}


#
#-keepclassmembers class com.transferFund.fundTransfer.model.FundTransferModel.** { <fields>; }
#-keepclassmembers class com.transferFund.fundTransfer.FundTransferDataSource.** { <fields>; }
-keep class io.plaidapp.data.api.dribbble.model.** { *; }
-keepnames class kotlinx.** { *; }
-keep class com.google.gson.** { *; }
-keep class com.google.gson.** { *; }
-keep class com.** { *; }
-keepattributes Signature
-keepattributes *Annotation*
-keep class com.google.gson.** { *; }
-keep class com.google.gson.stream.** { *; }
# Retain service method parameters when optimizing.
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}


-keep class package.to.yourmodels.** { *; }
-keep class android.os.AsyncTask { *; }
-keep public class org.jsoup.** {
    public *;
}
-keepclassmembers enum * { *; }

-keep class com.google.** { *; }
-keep class com.github.** { *; }
-keep class com.android.** { *; }
-keep class junit.** { *; }
-keep class com.example.com.mymodels.** { *; }
-keepclassmembers class com.example.com.mymodels.** { *; }



# The official support library.
#-keep class android.support.v4.** { *; }
#-keep interface android.support.v4.** { *; }
#-keep class android.support.v7.** { *; }
#-keep interface android.support.v7.** { *; }
#-keep class com.viewpagerindicator.** { *; }
#-keep interface com.viewpagerindicator.** { *; }

# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
