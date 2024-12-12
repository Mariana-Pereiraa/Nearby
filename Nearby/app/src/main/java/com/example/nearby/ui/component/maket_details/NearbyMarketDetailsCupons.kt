package com.example.nearby.ui.component.maket_details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.ui.theme.Gray400
import com.example.nearby.ui.theme.GreenExtraLight
import com.example.nearby.ui.theme.Typography
import com.example.nearby.R
import com.example.nearby.ui.theme.GreenBase

@Composable
fun NearbyMarketDetailsCupons(
    modifier: Modifier = Modifier,
    cupons: List<String>) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(
            text = "Utilize esse cupom",
            style = Typography.headlineSmall,
            color = Gray400
        )
        cupons.forEach{ cupom ->
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .clip(RoundedCornerShape(8.dp)) //deixar o fundinho da caixa de verde
                    .background(GreenExtraLight)
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.ic_ticket),
                    tint = GreenBase,
                    contentDescription = "Ícone de Cupons"
                )

                Text(
                    text = cupom,
                    style = Typography.headlineSmall
                )
            }
        }
    }
}

@Preview
@Composable
private fun NearbyMarketDetailsCuponsPreview() {
    NearbyMarketDetailsCupons(
        modifier = Modifier.fillMaxWidth(),
        cupons = listOf("FM4345T6", "FM4345T5")
    )
}