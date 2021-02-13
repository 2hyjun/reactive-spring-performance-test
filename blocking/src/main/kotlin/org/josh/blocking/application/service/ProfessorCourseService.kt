package org.josh.blocking.application.service

import javassist.NotFoundException
import org.josh.blocking.domain.course.JpaCourse
import org.josh.blocking.domain.course.CourseService
import org.josh.blocking.domain.course.JpaCourse2
import org.josh.blocking.domain.professor.JpaProfessor
import org.josh.blocking.domain.professor.ProfessorService
import org.josh.blocking.interfaces.dto.ProfessorCoursesDto
import org.josh.blocking.interfaces.dto.ProfessorCoursesDto2
import org.springframework.stereotype.Service

@Service
class ProfessorCourseService(
    private val professorService: ProfessorService,
    private val courseService: CourseService
) {
    fun getCourse(professorId: Long): ProfessorCoursesDto2 {
        val professor = professorService.getProfessor(professorId) ?: throw NotFoundException("Professor $professorId Not Found")
        val courses = courseService.getByProfessor(professor)

        return professor.toDtoWith(courses)
    }

    private fun JpaProfessor.toDtoWith(courses: List<JpaCourse2>): ProfessorCoursesDto2 {
        return ProfessorCoursesDto2(
            id,
            name,
            courses.map { course -> ProfessorCoursesDto2.CourseDto(course.name) }
        )
    }
}
