package com.topanlabs.recyclerviewtopan.model

import java.io.Serializable

data class MercedesCar (
    var name: String = "",
    var photo: Int = 0,
    var acceleration: String = "",
    var power: Int = 0,
    var torque: Int = 0,
    //var color : List<String> = listOf(),
    var engine: String="",
    var tagline: String = "",
    var harga: Int = 0,
    var liked: Boolean = false

) : Serializable