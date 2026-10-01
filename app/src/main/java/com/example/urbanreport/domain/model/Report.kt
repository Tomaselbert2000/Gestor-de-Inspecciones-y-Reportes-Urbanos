package com.example.urbanreport.domain.model

data class Report(
    val id: String,
    val description: String,
    val latitude: Double,
    val longitude: Double,
) {
    init {
        if (description.isBlank()) throw IllegalArgumentException()
        if (latitude < -90 || latitude > 90) throw IllegalArgumentException()
        if (longitude < -180 || longitude > 180) throw IllegalArgumentException()
    }
}
