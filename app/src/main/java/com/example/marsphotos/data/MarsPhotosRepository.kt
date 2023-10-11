package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.model.NotaTarea

import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<NotaTarea>

}

class NetworkMarsPhotosRepository(private val marsApiService: MarsApiService) : MarsPhotosRepository{
    /*override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return  MarsApi.retrofitService.getPhotos()
    }*/

    override suspend fun getMarsPhotos(): List<NotaTarea> = marsApiService.getPhotos()
    //override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}



