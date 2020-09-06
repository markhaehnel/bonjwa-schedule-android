package xyz.haehnel.bonjwa.ui.events

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import xyz.haehnel.bonjwa.model.BonjwaEventItem
import xyz.haehnel.bonjwa.ui.darkTheme
import xyz.haehnel.bonjwa.ui.lightTheme

@Composable
fun EventItemCard(item: BonjwaEventItem) {
    Card(
        backgroundColor = MaterialTheme.colors.primaryVariant
    ) {
        Row(modifier = Modifier.padding(16.dp) then Modifier.fillMaxWidth()) {
            Column {
                Text(text = item.title, style = MaterialTheme.typography.h6)
                Text(
                    text = item.date,
                    style = MaterialTheme.typography.subtitle1
                )
            }
        }
    }
}

@Preview("Event Item Card (Dark)")
@Composable
fun previewDarkEventItemCard() {
    MaterialTheme(colors = darkTheme) {
        EventItemCard(item = BonjwaEventItem("Community Treffen", "14. November"))
    }
}

@Preview("Event Item Card (Light)")
@Composable
fun previewLightEventItemcard() {
    MaterialTheme(colors = lightTheme) {
        EventItemCard(item = BonjwaEventItem("Community Treffen", "14. November"))
    }
}