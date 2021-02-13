package org.josh.nonblocking.domain.course

import org.josh.domain.course.Course
import org.josh.domain.course.CourseGrade
import org.josh.domain.student.StudentGrade
import org.josh.nonblocking.domain.professor.R2dbcProfessor
import org.josh.nonblocking.domain.shared.R2dbcDomainEntity
import org.josh.nonblocking.domain.student.R2dbcStudent
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.relational.core.mapping.Table

@Table("course")
class R2dbcCourse(
    override var id: Long,
    override val name: String
): R2dbcDomainEntity(), Course {

}