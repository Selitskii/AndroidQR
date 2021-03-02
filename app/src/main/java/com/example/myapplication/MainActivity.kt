package com.example.myapplication

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val text: TextView =findViewById(R.id.text)
        val imageView:ImageView=findViewById(R.id.imageView)
        //text.text=getString(R.string.PARAM)


       // text.text=BuildConfig.VERSION_NAME
        //text.text=resources.getText(R.string.PARAM)



       // Glide.with(this).load("https://images.wallpaperscraft.ru/image/plitvitskie_ozera_khorvatiya_ozero_park_gory_99018_2560x1600.jpg").into(imageView)
        //Timber.plant(Timber.DebugTree())
        //val str="Message"
        //Timber.d(str)
        var barcodeEncoder:BarcodeEncoder= BarcodeEncoder()
        var bitmap:Bitmap= barcodeEncoder.encodeBitmap("Content",BarcodeFormat.QR_CODE,400,400)
        imageView.setImageBitmap(bitmap)
    }
}