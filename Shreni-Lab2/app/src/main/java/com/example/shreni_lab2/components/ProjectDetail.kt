package com.example.shreni_lab2.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shreni_lab2.Project
import com.example.shreni_lab2.R
import com.example.shreni_lab2.ui.theme.ShreniLab2Theme

@Composable
fun ProjDetail(
    proj: Project,
    onEdit:()->Unit ) {
    var isFavorite by remember{ mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.common_padding))
            .fillMaxWidth(),
    ){
        Button(
            onClick = onEdit,
            modifier = Modifier.align(Alignment.End)
        ){
            Text( "edit")
        }

        Text(
            text = proj.title,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.common_padding)),
        )

        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        Text (
            text = proj.description,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        Text (
            text = proj.authors,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        Text (
            text = proj.projectLinks,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        Text (
            text = proj.keywords,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        Row (
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Is it your fav project",

                modifier = Modifier.padding(end = 16.dp))
            Switch(
                checked = isFavorite,
                onCheckedChange = { isFavorite = it }
            )
        }

    }
}

@Preview(name = "ProjectDetail")
@Composable
private fun ProjDetailPreview() {
    ShreniLab2Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProjDetail(Project("ProjectPortal", "ProjectPortal is ....", "Author Name",
                "Project Link", "Key word to search", true), {})
        }
    }
}