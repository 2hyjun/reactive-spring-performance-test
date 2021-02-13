package org.josh.nonblocking.domain.course

import org.josh.nonblocking.domain.professor.R2dbcProfessor
import org.springframework.stereotype.Service

@Service
class CourseService(
    private val courseRepository: CourseRepository
) {
    suspend fun getByProfessor(professor: R2dbcProfessor): List<R2dbcCourse> {
        return courseRepository.findAllByProfessor(professor)
    }
}