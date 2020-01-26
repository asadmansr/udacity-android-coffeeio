package com.asadmansr.udacity.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.asadmansr.udacity.R
import com.asadmansr.udacity.adapter.DiscoverAdapter
import com.asadmansr.udacity.model.Discovery
import kotlinx.android.synthetic.main.activity_discover.*

class DiscoverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover)

        rv_discover_list.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_discover_list.hasFixedSize()
        rv_discover_list.adapter =
            DiscoverAdapter(this, getDiscoveryList())
    }

    private fun getDiscoveryList(): ArrayList<Discovery> {
        val discoveryList = ArrayList<Discovery>()
        discoveryList.add(
            Discovery(
                title = "Joe's Coffee",
                subtitle = "North Park",
                imgRes = R.drawable.coffee_1,
                description = "Hip local chain doing out coffee & espresso-based beverages " +
                        "crafted from house-roasted beans.",
                address = "4941 Merton Street, Toronto ON",
                hours = "Open Today 7am-10pm"
            )
        )
        discoveryList.add(
            Discovery(
                title = "Coffee & Tea",
                subtitle = "Downtown",
                imgRes = R.drawable.coffee_2,
                description = "Instant, barista sugar, so carajillo est affogato java steamed. " +
                        "Aftertaste, blue mountain mazagran.",
                address = "2461 Eglinton Avenue, Toronto ON",
                hours = "Open Today 8am-12pm"
            )
        )
        discoveryList.add(
            Discovery(
                title = "Bob's Coffee Shop",
                subtitle = "Lakefront",
                imgRes = R.drawable.coffee_3,
                description = "Cup cortado and eu est sit spoon blue mountain iced caffeine " +
                        "con panna. ",
                address = "1303 Front Street, Toronto ON",
                hours = "Open Today 6am-6pm"
            )
        )
        discoveryList.add(
            Discovery(
                title = "Java Cafe",
                subtitle = "King St",
                imgRes = R.drawable.coffee_4,
                description = "Fair trade barista, seasonal half and half, as whipped white irish " +
                        "medium. Eu, saucer cortado, organic caramelization doppio roast single origin.",
                address = "4525 Yonge Street, Toronto ON",
                hours = "Open Today 7am-8pm"
            )
        )
        return discoveryList
    }
}
