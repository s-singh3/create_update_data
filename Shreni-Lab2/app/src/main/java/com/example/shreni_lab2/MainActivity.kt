package com.example.shreni_lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shreni_lab2.components.ProjDetail
import com.example.shreni_lab2.components.ProjEdit
import com.example.shreni_lab2.ui.theme.ShreniLab2Theme
import androidx.navigation.compose.rememberNavController
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShreniLab2Theme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    )
                {
                    NavGraph()
                }
            }
        }
    }
}

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ProjectPortalDests.PROJ_DETAIL_ROUTE) {

        composable(route = "ProjectDetail") {
            ProjDetail(Project.project,
                onEdit = {
                    navController.navigate(ProjectPortalDests.PROJECT_EDIT_ROUTE)
                })
        }
        composable(route = "ProjectEdit") {
            ProjEdit(Project.project, onEditDone = {
                navController.navigate(ProjectPortalDests.PROJ_DETAIL_ROUTE)
            })
        }
    }
}

object ProjectPortalDests {
    const val PROJ_DETAIL_ROUTE = "ProjectDetail"
    const val PROJECT_EDIT_ROUTE = "ProjectEdit"
}
