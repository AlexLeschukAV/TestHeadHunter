package com.example.api

import com.example.models.Offers
import com.example.models.Vacancy
import kotlinx.coroutines.flow.Flow

interface OffersRepository {
    fun getOffers(): Flow<Offers?>

    fun getAllFavoriteVacancy(): Flow<List<Vacancy>>
    suspend fun addVacancies(vacancies: List<Vacancy>)
}