package com.ronak.allsethome.ui.home

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import com.ronak.allsethome.R

class Detail_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen)

        var a ="<p><span style=\"font-size: 16px;\"><strong>Home AC Repair: Drainage Issues</strong></span></p>" +
                "<p><br></p>" +
                "<ul>" +
                "    <li>An air conditioner&rsquo;s cooling process produces condensation,</li>" +
                "    <li>which normally flows away from the equipment,</li>" +
                "    <li>causing no problem. If there is a clog in the&nbsp;</li>" +
                "    <li>condensate drain lines or drip pan, or if outdoor humidity levels are high.</li>" +
                "\n\n</ul>" +
                "<p>Moisture may back up into your air conditioner. Excess condensation will increase indoor humidity levels and hinder the air conditioner&rsquo.</p>\n" +
                "<p>If air conditioner components have been damaged, your technician will provide you with an estimate to repair this equipment.</p>"

        var text = findViewById<TextView>(R.id.text)

        text.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(a, Html.FROM_HTML_MODE_COMPACT)
        } else {
            Html.fromHtml(a)
        }
    }
}