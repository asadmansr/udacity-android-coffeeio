package com.asadmansr.udacity.ui

import Extra
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asadmansr.udacity.R
import kotlinx.android.synthetic.main.activity_restaurant.*

class RestaurantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        setupView()
    }

    private fun setupView() {
        val intent = intent
        val extras = intent.extras!!

        val restaurantName = extras.getString(Extra.EXTRA_RESTAURANT_NAME)
        val restaurantImage = extras.getInt(Extra.EXTRA_RESTAURANT_IMAGE)
        val restaurantDescription = extras.getString(Extra.EXTRA_RESTAURANT_DESCRIPTION)
        val restaurantAddress = extras.getString(Extra.EXTRA_RESTAURANT_ADDRESS)
        val restaurantHours = extras.getString(Extra.EXTRA_RESTAURANT_HOURS)

        tv_restaurant_title.text = restaurantName
        iv_restaurant_banner.setImageResource(restaurantImage)
        tv_vibe_description.text = restaurantDescription
        tv_address_content.text = restaurantAddress
        tv_hours_content.text = restaurantHours

        rl_back_button.setOnClickListener {
            finish()
        }
    }
}
