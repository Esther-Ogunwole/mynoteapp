package com.esther.noteapp.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.esther.noteapp.componets.NoteItem
import com.esther.noteapp.ui.theme.NoteAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Notelistscreen() {
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = " Hadassah Note App") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                actions = {
                    IconButton(onClick = { }){
                        Icon(
                            imageVector = Icons.Default.Search ,
                            contentDescription = " Search fo note"
                        )
                    }
                    IconButton(onClick = {}){
                        Icon(imageVector = Icons.Default.MoreVert,
                            contentDescription ="More Icon"
                        )

                    }
                }
            )

        },
        content = {paddingValues ->
            Column (modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
            )
            {
                NoteItem()
                NoteItem()
                }

        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add New Note"
                )

            }
        }

    )
}

@Preview
@Composable
fun NotelistscreenPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Notelistscreen()

    }

}









