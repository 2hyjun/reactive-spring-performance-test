package org.josh.nonblocking.domain.professor

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProfessorService(
    private val professorRepository: ProfessorRepository
) {
    suspend fun getProfessor(id: Long): R2dbcProfessor? {
        return professorRepository.findByIdOrNull(id)
    }
}