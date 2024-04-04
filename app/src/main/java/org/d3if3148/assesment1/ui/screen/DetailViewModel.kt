package org.d3if3148.assesment1.ui.screen

import androidx.lifecycle.ViewModel
import org.d3if3148.assesment1.model.ToDoList

class DetailViewModel : ViewModel() {
    fun getTodo(id: Long): ToDoList {
        return ToDoList(
            id,
            "Tugas VVPL $id",
            "Level Prioritas: Medium",
            "Batas Pengumpulan: 21 April 2024",
            "- bagi jobdesk kerkom\n- dokumen uat"
        )
    }
}