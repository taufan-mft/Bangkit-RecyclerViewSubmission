package com.topanlabs.recyclerviewtopan.model

import com.topanlabs.recyclerviewtopan.R

object MercedesData {
    private val mobilNames = listOf(
        "GLA SUV", "GLB SUV", "GLC SUV",
        "A-Class Sedan", "C-Class Sedan", "E-Class Sedan",
        "CLA Coupe", "C-Class Coupe", "E-Class Coupe",
        "CLS Coupe"
    )

    private val accel = listOf(
        "6.8", "6.9", "6.1",
        "7.1", "5.7", "6.1",
        "6.3", "5.9", "5.2",
        "5.1"
    )

    private val power = listOf(
        221, 221, 225,
        188, 255, 255,
        221, 255, 362,
        362
    )

    private val torque = listOf(
        258, 258, 273,
        221, 273, 273,
        258, 273, 369,
        369
    )

    private val engine = listOf(
        "2.0L inline-4 turbo", "2.0L inline-4 turbo", "2.0L inline-4 turbo",
        "2.0L inline-4 turbo", "2.0L inline-4 turbo", "2.0L inline-4 turbo",
        "2.0L inline-4 turbo", "2.0L inline-4 turbo", "3.0L inline-6 turbo engine with EQ Boost",
        "3.0L inline-6 turbo engine with EQ Boost"
    )

    private val tagline = listOf(
        "A true premium compact", "An ideal blend of space, capability, technology and comfort.", "It's more than a new name. It's the next generation of the SUV.",
        "An entirely new class of Mercedes-Benz that sets a new standard for small sedans.", "A stylish performer that embodies sophistication and intelligence.", "Distinctive styling, class-leading safety and trailblazing technology.",
        "An entirely new seductive style at an even more irresistible price.", "Bold styling, sporty performance and competitive spirit in two doors.", "An alluring silhouette, with the performance and amenities to match.",
        "A powerful expression of individuality in a visionary four-door coupe."
    )

    private val harga = listOf(
        41335, 48555, 48835,
        39005, 50125, 60625,
        37850, 47200, 64950,
        70300
    )

    private val images = listOf(
        R.drawable.gla
    )
    val listData: ArrayList<MercedesCar>
    get() {
        val list = arrayListOf<MercedesCar>()
        for (pos in mobilNames.indices) {
            val merc = MercedesCar()
            merc.name = mobilNames[pos]
            merc.acceleration = accel[pos]
            merc.engine = engine[pos]
            merc.harga = harga[pos]
            merc.power = power[pos]
            merc.tagline = tagline[pos]
            merc.torque = torque[pos]
            merc.photo = R.drawable.gla
            list.add(merc)
        }
        return list
    }


}