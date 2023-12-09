package com.example.myapplication

data class Toilet (
    val Commune: String,
    val Code_Postal: String,
    val PointGeo: PointGeo,
    val Id: String,
    val Longitude: String,
    val OpeningHours: String,
    val imageURL: String ?= null,
    val isFavorite: Boolean )