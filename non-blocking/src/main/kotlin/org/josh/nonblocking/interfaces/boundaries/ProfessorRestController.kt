package org.josh.nonblocking.interfaces.boundaries

import org.josh.nonblocking.application.ProfessorCourseService
import org.josh.nonblocking.domain.course.CourseRepository
import org.josh.nonblocking.domain.course.R2dbcCourse
import org.josh.nonblocking.domain.professor.ProfessorRepository
import org.josh.nonblocking.interfaces.dto.ProfessorCoursesDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfessorRestController(
    private val professorCourseService: ProfessorCourseService
) {
    @GetMapping("/professor/{id}")
    suspend fun get(@PathVariable id: Long): ProfessorCoursesDto {
        return professorCourseService.getCourse(id)
    }
}