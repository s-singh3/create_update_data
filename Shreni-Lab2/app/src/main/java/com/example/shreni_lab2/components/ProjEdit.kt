
package com.example.shreni_lab2.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shreni_lab2.Project
import com.example.shreni_lab2.R
import com.example.shreni_lab2.ui.theme.ShreniLab2Theme


@Composable

fun ProjEdit(proj: Project,
             onEditDone:()->Unit){
    var projTitle by remember {mutableStateOf(proj.title)}
    var projDesp by remember{ mutableStateOf(proj.description)}
    var projAuthor by remember{mutableStateOf(proj.authors)}
    var projLinks by remember{mutableStateOf(proj.projectLinks)}
    var projKeyword by remember{mutableStateOf(proj.keywords)}




    Column(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.common_padding))
            .fillMaxWidth(),
    ){
        val textFieldColors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            cursorColor = Color.Black
        )

        Button(
            onClick = {
                proj.title = projTitle
                proj.description = projDesp
                proj.authors = projAuthor
                proj.projectLinks = projLinks
                proj.keywords = projKeyword
                onEditDone()
            },
            modifier = Modifier.align(Alignment.End)
        ){
            Text("summit" )
        }

        OutlinedTextField(
            value = projTitle,
            onValueChange = {projTitle = it},
            textStyle = MaterialTheme.typography.titleLarge,
            colors = textFieldColors,
            modifier = Modifier.fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.common_padding)),

            )

        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        OutlinedTextField (
            value = projDesp,
            onValueChange = {projDesp = it},
            colors = textFieldColors,
            modifier = Modifier.fillMaxWidth()


        )

        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        OutlinedTextField (
            value = projAuthor,
            onValueChange = {projAuthor = it},
            colors = textFieldColors,
            modifier = Modifier.fillMaxWidth()


        )

        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        OutlinedTextField (
            value = projLinks,
            onValueChange = {projLinks = it},
            colors = textFieldColors,
            modifier = Modifier.fillMaxWidth()


        )
        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

        OutlinedTextField (
            value = projKeyword,
            onValueChange = {projKeyword = it},
            colors = textFieldColors,
            modifier = Modifier.fillMaxWidth()
        )
        Divider(Modifier.fillMaxWidth().
        padding(dimensionResource(id = R.dimen.common_padding)))

    }
}
@Preview(name = "ProjectEdit")
@Composable
private fun ProjEditPreview() {
    ShreniLab2Theme  {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProjDetail(Project("ProjectPortal", "ProjectPortal is ....", "Author Name",
                "Project Link", "Key word to search", true), {})
        }
    }
}