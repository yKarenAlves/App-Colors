package com.example.cores


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var seekBarVermelho: SeekBar? = null
    private var seekBarVerde: SeekBar? = null
    private var seekBarAzul: SeekBar? = null
    private var corResultante: TextView? = null
    private var textVermelho: TextView? = null
    private var textVerde: TextView? = null
    private var textAzul: TextView? = null
    private var vermelho: Int = 0
    private var verde: Int = 0
    private  var azul: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarVermelho = findViewById(R.id.seekBarVermelho)
        seekBarVerde = findViewById(R.id.seekBarVerde)
        seekBarAzul = findViewById(R.id.seekBarAzul)
        corResultante = findViewById(R.id.textResultado)
        textVermelho = findViewById(R.id.textVermelho)
        textVerde = findViewById(R.id.textVerde)
        textAzul = findViewById(R.id.textAzul)

        //SeekBar Vermelho
        seekBarVermelho?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textVermelho?.setText("Vermelho: ${progress}" )
                vermelho = progress
                corResultante!!.setBackgroundColor(Color.rgb(vermelho,verde ,azul))
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        //SeekBar Verde
        seekBarVerde?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textVerde?.setText("Verde: ${progress}")
                verde = progress
                corResultante!!.setBackgroundColor(Color.rgb(vermelho,verde ,azul))
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })


        //SeekBar Azul

        seekBarAzul?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textAzul?.setText("Azul: ${progress}")
                azul = progress
                corResultante!!.setBackgroundColor(Color.rgb(vermelho,verde ,azul))
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })


    }

    fun sortearCor(view: View) {

        vermelho = Random.nextInt(256)
        verde = Random.nextInt(256)
        azul = Random.nextInt(256)

        seekBarVermelho?.setProgress(vermelho)
        seekBarVerde?.setProgress(verde)
        seekBarAzul?.setProgress(azul)


        corResultante!!.setBackgroundColor(Color.rgb(vermelho,verde ,azul))
    }
}