package org.josh.nonblocking.domain.course

import org.josh.domain.course.Course
import org.josh.domain.course.CourseGrade
import org.josh.domain.course.CourseReport
import org.josh.domain.student.Student
import org.josh.nonblocking.domain.shared.R2dbcDomainEntity
import org.josh.nonblocking.domain.student.R2dbcStudent
import org.springframework.data.relational.core.mapping.Table

@Table("course_report")
class R2dbcCourseReport(
    override var id: Long,
    override val student: R2dbcStudent,
    override val courseGrade: CourseGrade
): R2dbcDomainEntity(), CourseReport