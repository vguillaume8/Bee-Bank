package com.beebank.Bee.Bank.service

import com.beebank.Bee.Bank.model.ModelEntity
import com.beebank.Bee.Bank.model.User
import com.beebank.Bee.Bank.repository.CrudRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.domain.PageRequest

/**
 * Generic service that contains all basic validation and business
 * logic for performing basic CRUD operations. These operations can
 * be overloaded to perform addition business logic either before or
 * after the transaction. However, it is recommended to use the methods
 * implemented in this class to perform the actual transaction with the
 * persistence layer to avoid error.
 *
 * @param <T> Generic type that extends ModelEntity
 * @see ModelEntity
 */
abstract  class CrudService<T extends ModelEntity> {

    private static final Logger log = LoggerFactory.getLogger(CrudService.class)

    abstract CrudRepository<T> getRepository()

    def findById(Long id) {

        log.info("Finding entity by id ${id}")

        return repository.findById(id)
    }

    def findAll(int page, int size) {

        log.info("Finding all entities")

        def request = new PageRequest(page, size)

        return repository.findAll(request)
    }

    def save(T entity) {

        log.info("Saving new entity")

        return repository.save(entity)
    }

    def update(Long id, T entity) {

        log.info("Updating entity with id ${id}")

        return repository.save(entity)
    }

    def deleteById(Long id) {

        log.info("Deleting entity with id ${id}")

        return repository.deleteById(id)
    }
}
