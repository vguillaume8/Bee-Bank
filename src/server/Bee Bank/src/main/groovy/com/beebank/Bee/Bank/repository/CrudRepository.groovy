package com.beebank.Bee.Bank.repository

import com.beebank.Bee.Bank.model.ModelEntity
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.PagingAndSortingRepository

@NoRepositoryBean
interface CrudRepository<T extends ModelEntity> extends PagingAndSortingRepository<T, Long> {
}
