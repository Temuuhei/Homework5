package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView : AppCompatActivity(), ListAdapter.ItemClickListener {
    val products = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        supportActionBar?.title = "Electronics Category"

        products.add(Product("Lew's Mach Smash SLP Baitcast Combo", 149.95, "Red & Black", R.drawable.image1, "#5123142", "ICAST 2019 best of show Baitcast combo award winner. With a once year limited combo.\n" +
                "Reel features: 1-piece lightweight Super Low Profile (SLP) graphite frame and sideplates with 3 drain ports. High strength solid brass Speed Gears, cut on precision Hamai CNC gear hobbing machines. Externally adjustable Magnetic Control System (MCS).\n" +
                "A premium 8 bearing system with stainless steel double shielded bearings and zero reverse 1-way clutch. Machine, anodized, large capacity aluminum 32 millimeter spool and Graphite star drag.\" Reel features: A 95 millimeter bowed, anodized, bowed aluminum handle with Lew's Combat Grip paddle knobs. Combat Grip thumb bar and anodized, aluminum spool tension cap. Zirconia line guide."))
        products.add(Product("Boat Cover, MAROUTE 600D Waterproof Trailerable Boat Cover\" Wide", 108.00, "Red & Gray", R.drawable.image2, "#6123142", "Waterproof 600D Polyester Canvas: Made of durable polyester canvas, MAROUTE boat cover is waterproof, tear-resistant, UV-resistant. Double PU coating and double-stitched seams with waterproof tape improve the tear resistance and waterproof.\n" +
                "Universal Boat Cover: MAROUTE boat cover fits 20-22feet bass boat, fishing boat, V-hull, tri-hull, runabout, trailerable boat. The cover specific size is 280\" long x 136\" wide. We strongly recommend that measure your boat first to see if it matches our boat cover.\n" +
                "All Weather Protection: MAROUTE boat cover is UV-resistant, tears and cold cracking, so that can give your boat maximum protection against toughest weather, rain, snow, ice, wind, dust or sun, sand storms, dirt and pollution all year round."))
        products.add(Product("Pelican - Bass Raider 10E Angler Fishing Boat - 10.2 ft", 1999.00, "Khaki / Beige", R.drawable.image3, "#7123142", "Durable: Our patented RAM-X material is known for its high-impact resistance and will make your fishing boat last through time.\n" +
                "Comfortable: Navigate in comfort with two folding seats that can slide along the tracks so you can adjust your position on the boat. This comfortable seat also swivels 360 degrees so you can face any direction while you're fishing or reaching for equipment. Additional features include multiple storage compartments, drink holders and two vertical rod holders for your convenience. \n" +
                "Pre-Wired: The BASS RAIDER 10E fishing boat is pre-wired to easily connect an electric motor and/or a sonar with a 12 V electrical outlet."))
        products.add(Product("Allnice Durable Canvas Fishing Rod & Reel Organizer Bag Travel Carry Case Bag- Holds 5 Poles & Tackle\"", 59.99, "Khaki & Green", R.drawable.image4, "#8123142", "Khaki Green Fishing Rod Case- A greenish khaki color with black trim.\n" +
                "The carry case holds 5 rods and reels on the outside, plus more rods, reels, tackle and equipment on the inside.\n" +
                "Heavy duty grade high-tech polyester.\n" +
                "Adjustable shoulder strap. Flat-Expands to 48 inches high and 13 inches in width.\n" +
                "If you love to fish, this is the perfect organizer for you."))
        products.add(Product("Gifts for Men Dad Husband, Survival Gear and Equipment Kit 30 in 1", 42.99, "30 in 1", R.drawable.image5, "#9123142", "Must Have Survival Gear and Equipment: 30 in 1 Emergency Survival Kit contains: 14 in 1 Hatchet, 18 in 1 Snowflake Multi Tool, Tactical Pen, Water Bottle Clip, Emergency Blanket, Flint Stone Scraper, SOS Whistle, Survival Bracelet, Flashlight, Multi-use Spoon Fork, Carabiner, Parachute Cord , AA Battery, and Storage Case."))
        products.add(Product("RUNCL Chest Waders with Boots Fishing Waders Waist-High Waders - Updated 400D Nylon Outer Seamless Breathable Tech Ergonomic Design Fly Patch - Wader Fishing Fly Fishing Hunting", 59.99, "Black & Green", R.drawable.image6, "#2123142", "【Warm Tips】: For a better fit, please watch the video titled \"how to choose the perfect fitting chest waders\" in the photo section or video section, and then check out the size chart to choose the best fitting waders with boots before placing an order"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ListAdapter(products, this)
        recyclerView.adapter = adapter

    }

    override fun onItemClick(position: Int) {
        val detailIntent = Intent(applicationContext, ProductDetail::class.java)
        detailIntent.putExtra("PRODUCT", products[position])
        startActivity(detailIntent)
    }
}