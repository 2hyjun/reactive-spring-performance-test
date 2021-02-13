package org.josh.nonblocking.domain.professor

import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.query.Param

interface ProfessorRepository : R2dbcRepository<R2dbcProfessor, Long> {
    @Query("SELECT * FROM professor WHERE id = :id")
    suspend fun findByIdOrNull(@Param("id") id: Long): R2dbcProfessor?
}