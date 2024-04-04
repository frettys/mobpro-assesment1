package org.d3if3148.assesment1.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3148.assesment1.model.ToDoList

class MainViewModel : ViewModel() {
    val data = getDataDummy()

    private fun getDataDummy(): List<ToDoList>{
        val data = mutableListOf<ToDoList>()
        for (i in 29 downTo 20){
            data.add (
                ToDoList(
                    i.toLong(),
                    "Tugas VVPL $i",
                    "Level Prioritas: Medium",
                    "Batas Pengumpulan: 21 April 2024",
                    "- bagi jobdesk kerkom\n- dokumen uat"
                )
            )
        }
        return data
    }
}
