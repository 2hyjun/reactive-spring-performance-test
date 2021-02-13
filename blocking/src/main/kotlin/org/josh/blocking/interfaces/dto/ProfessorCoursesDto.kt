package org.josh.blocking.interfaces.dto

import org.josh.domain.course.CourseGrade

data class ProfessorCoursesDto(
    val professorId: Long,
    val name: String,
    val courses: List<CourseDto>
) {
    data class CourseDto(
        val name: String,
        val courseReports: List<CourseReportDto>
    )

    data class CourseReportDto(
        val studentName: String,
        val courseGrade: CourseGrade
    )
}

data class ProfessorCoursesDto2(
    val professorId: Long,
    val name: String,
    val courses: List<CourseDto>
) {
    data class CourseDto(
        val name: String
    )
}