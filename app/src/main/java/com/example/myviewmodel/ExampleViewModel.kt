package com.example.myviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ExampleViewModel: ViewModel() {
    // MutableStateFlow para actualizar los datos internamente
    private val _data = MutableStateFlow("Initial Value")

    // StateFlow para exponer los datos inmutables a la UI
    val data: StateFlow<String> = _data

    fun updateData(newValue: String) {
        // Actualizar el valor de _data. Observar que _data se declara como val
        // por lo tanto no puede cambiarse su referencia , ejemplo _data = nuevoData
        // pero _dat.value se refiere a un MutableStateFlow que si se puede cambiar.
        _data.value = newValue

    }
}