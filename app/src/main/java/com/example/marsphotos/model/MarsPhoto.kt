package com.example.marsphotos.model

import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto(
    val id: String,  val img_src: String
)

@Serializable
data class NotaTarea(
    val id: ULong, val titulo: String?,
    val contenido: String?, val estatus: Int?,
    val tipo: Int?, val fecha: String?,
    val fechaModi: String?, val fechaCum: String?)