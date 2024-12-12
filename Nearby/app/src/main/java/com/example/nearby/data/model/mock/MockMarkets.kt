package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "1",
        categoryId = "1",
        name = "Mercado do João",
        description = "O melhor mercado da região",
        cupons = 10,
        latitude = -23.563987,
        longitude = -46.653281,
        adress = "Rua das Flores, 123",
        phone = "(11) 99999-9999",
        cover = "https://picsum.photos/200/300"
    ),
    Market(
        id = "2",
        categoryId = "2",
        name = "Mercado da Maria",
        description = "O mercado mais antigo da região",
        cupons = 5,
        latitude = -23.563987,
        longitude = -46.653281,
        adress = "Rua das Flores, 123",
        phone = "(11) 99999-9999",
        cover = "https://picsum.photos/200/300"
    ),
)