package org.josh.blocking.domain.course

import org.josh.blocking.domain.professor.JpaProfessor
import org.josh.blocking.domain.shared.JpaDomainEntity
import org.josh.blocking.domain.student.JpaStudent
import org.josh.domain.course.Course
import org.josh.domain.course.CourseGrade
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "course")
class JpaCourse(
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    val professor: JpaProfessor,
    override val name: String,

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
    var courseReports: List<JpaCourseReport>
) : JpaDomainEntity(), Course {
    constructor() : this(JpaProfessor(), "", emptyList())

    fun addReport(student: JpaStudent, grade: CourseGrade) {
        val report = JpaCourseReport(student, grade)

        courseReports += report
    }
}


