package com.example.marsphotos.network
import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.model.NotaTarea
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
//import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://4f3a-189-169-18-160.ngrok-free.app"



private val retrofit = Retrofit.Builder()
                        .addConverterFactory(
                            Json.asConverterFactory("application/json".toMediaType())
                        )
                        .baseUrl(BASE_URL)
                        .build()

interface MarsApiService {
    @GET("/api/NotasTareas")
    suspend fun getPhotos() : List<NotaTarea>
}

/*
object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
*/
