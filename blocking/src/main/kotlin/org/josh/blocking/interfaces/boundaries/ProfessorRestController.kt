package org.josh.blocking.interfaces.boundaries

import org.josh.blocking.application.service.ProfessorCourseService
import org.josh.blocking.interfaces.dto.ProfessorCoursesDto
import org.josh.blocking.interfaces.dto.ProfessorCoursesDto2
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfessorRestController(
    private val professorCourseService: ProfessorCourseService
) {
    @GetMapping("/professor/{id}")
    fun getProcessorAndCourses(@PathVariable id: Long): ProfessorCoursesDto2 {
        return professorCourseService.getCourse(id)
    }
}
