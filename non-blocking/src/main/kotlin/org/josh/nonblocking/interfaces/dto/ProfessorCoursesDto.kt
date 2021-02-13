package org.josh.nonblocking.interfaces.dto

import org.josh.domain.course.CourseGrade

data class ProfessorCoursesDto(
    val professorId: Long,
    val name: String,
    val courses: List<CourseDto>
) {
    data class CourseDto(
        val name: String
    )
}