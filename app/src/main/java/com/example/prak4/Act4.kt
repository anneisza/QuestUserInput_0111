package com.example.prak4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable
fun FormDatDiri(modifier: Modifier){
    //variabel untuk mengingat nilai masukan dari keyboard
    var textName by remember{ mutableStateOf(value = "") }
    var textAlamat by remember{ mutableStateOf(value = "") }
    var textJK by remember{ mutableStateOf(value = "") }
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    //variabel untuk nyimpan data yg diperlukan dari komponen UI
    var nama by remember{ mutableStateOf(value = "") }
}