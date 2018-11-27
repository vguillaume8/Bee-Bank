package com.beebank.Bee.Bank.controller

import com.beebank.Bee.Bank.model.ModelEntity
import com.beebank.Bee.Bank.service.CrudService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

/**
 * Generic controller that has common logic for CRUD operations.
 * CRUD operations can be overridden in child-classes to perform
 * addition business logic before or after the transaction. However,
 * it is recommended to perform the actual CRUD operation with the
 * the methods implemented in this class to avoid error and to
 * maintain consistency.
 *
 * @param <T> Generic type that extends ModelEntity
 * @see ModelEntity
 */
abstract class CrudController<T extends ModelEntity> {

    abstract CrudService<T> getService()

    @GetMapping("/{id}")
    def findById(@PathVariable Long id) {

        def entity = service.findById(id)

        ResponseEntity.ok(entity)
    }

    @GetMapping
    def findAll(@RequestParam int page, @RequestParam int size) {

        def entities = service.findAll(page, size)

        ResponseEntity.ok(entities)
    }

    @PostMapping
    def save(@RequestBody T entity) {

        def result = service.save(entity)

        ResponseEntity.ok(result)
    }

    @PutMapping("/{id}")
    def update(@PathVariable Long id, @RequestBody T entity) {

        def result = service.update(id, entity)

        ResponseEntity.ok(result)
    }

    @DeleteMapping("/{id}")
    def deleteById(@PathVariable Long id) {

        def result = service.deleteById(id)

        ResponseEntity.ok(result)
    }
}
