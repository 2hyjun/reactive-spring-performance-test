package org.josh.blocking.domain.professor

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProfessorService(
    private val professorRepository: ProfessorRepository
) {
    fun getProfessor(id: Long): JpaProfessor? {
        return professorRepository.findByIdOrNull(id)
    }
}
