package org.josh.blocking.domain.course

import org.josh.blocking.domain.professor.JpaProfessor
import org.springframework.stereotype.Service

@Service
class CourseService(
    private val course2Repository: Course2Repository
) {
    fun getByProfessor(professor: JpaProfessor): List<JpaCourse2> {
        return course2Repository.findAllByProfessor(professor)
    }
}
