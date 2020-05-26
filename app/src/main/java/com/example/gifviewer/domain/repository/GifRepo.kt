package com.example.gifviewer.domain.repository

import com.example.gifviewer.domain.model.TenorResponse

interface GifRepo {

    suspend fun retrieveTrendingGifs(nextQueryPos: String): TenorResponse
}