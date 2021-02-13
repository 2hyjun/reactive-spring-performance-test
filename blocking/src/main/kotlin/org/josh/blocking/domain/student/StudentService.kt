package org.josh.blocking.domain.student

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository
) {
    fun getStudent(id: Long): JpaStudent? {
        return studentRepository.findByIdOrNull(id)
    }
}
