package com.example.nearby.ui.component.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.nearby.data.model.Category
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue
import com.example.nearby.data.model.mock.mockCategories

@Composable
fun NearbyCategoryFilterChipList(
    modifier: Modifier = Modifier,
    categories: List<Category>,
    onSelectedCategoryChanged: (Category) -> Unit
){
    //remember vai lembrar de valores setados, mesmo que o componente seja recriado
    var selectedCategoryId by remember { mutableStateOf(categories.firstOrNull()?.id.orEmpty()) }

    LaunchedEffect(key1 = selectedCategoryId) {
        val selectedCategoryOrNul = categories.find { it.id == selectedCategoryId }
        selectedCategoryOrNul?.let {
            onSelectedCategoryChanged(it)
        }
    }

    LazyRow (
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(items = categories, key = { it.id }) { category ->
            NearbyCategoryFilterChip(
                category = category,
                isSelected = category.id == selectedCategoryId,
                onClick = {isSelected ->
                    if(isSelected)
                    selectedCategoryId = category.id
                }
            )
        }
    }
}

@Preview
@Composable
private fun NearbyCategoryFilterChipListPreview() {
    NearbyCategoryFilterChipList(
        modifier = Modifier,
        categories = mockCategories,
        onSelectedCategoryChanged = {}
    )
}