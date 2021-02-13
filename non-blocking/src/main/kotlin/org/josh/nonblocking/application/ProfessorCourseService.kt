package org.josh.nonblocking.application


import org.josh.nonblocking.domain.course.CourseService
import org.josh.nonblocking.domain.course.R2dbcCourse
import org.josh.nonblocking.domain.professor.ProfessorService
import org.josh.nonblocking.domain.professor.R2dbcProfessor
import org.josh.nonblocking.interfaces.dto.ProfessorCoursesDto
import org.springframework.stereotype.Service

@Service
class ProfessorCourseService(
    private val professorService: ProfessorService,
    private val courseService: CourseService
) {
    suspend fun getCourse(professorId: Long): ProfessorCoursesDto {
        val professor = professorService.getProfessor(professorId) ?: throw Exception("Professor $professorId Not Found")
        val courses = courseService.getByProfessor(professor)

        return professor.toDtoWith(courses)
    }

    private fun R2dbcProfessor.toDtoWith(courses: List<R2dbcCourse>): ProfessorCoursesDto {
        return ProfessorCoursesDto(
            id,
            name,
            courses.map { course -> ProfessorCoursesDto.CourseDto(course.name) }
        )
    }
}
