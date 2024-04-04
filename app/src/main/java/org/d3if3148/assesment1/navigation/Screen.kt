package org.d3if3148.assesment1.navigation

import org.d3if3148.assesment1.ui.screen.KEY_ID_TUGAS

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object  About: Screen("aboutScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_TUGAS}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}