package com.x7.room_jc

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.x7.room_jc.data.NameEntity

@Composable
fun ListItem(
    item: NameEntity
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clickable {

            }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                 text = item.name,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(10.dp)
            )
            IconButton(onClick = {
                
            }) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete")
            }
        }
    }
}