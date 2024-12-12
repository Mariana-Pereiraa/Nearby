package com.example.nearby.data.model

import androidx.annotation.DrawableRes

data class Category(
    val id: String,
    val name: String
) {
    //anotação que indica que o valor é um recurso de drawable
    @get: DrawableRes
    val icon: Int?
        get() = CategoryFilterChipView.fromDrescription(description = name)?.icon
}
