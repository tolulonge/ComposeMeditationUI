package com.tolulonge.composemeditationui.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tolulonge.composemeditationui.ui.theme.DeepBlue


@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()
    ) {
        Column {


        }
    }
}


@Composable
fun GreetingSection(
    name: String = "Phillip"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
        ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "Good morning, $name",
            style = MaterialTheme.typography.h2
            )
            Text(
                text = "We wish you have a good day!",
            style = MaterialTheme.typography.body1
            )
        }
        Icon(painter = painterResource(id = R.dra), contentDescription = )

    }
}