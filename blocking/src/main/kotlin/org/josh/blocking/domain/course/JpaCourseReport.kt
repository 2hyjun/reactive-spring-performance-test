package org.josh.blocking.domain.course

import org.josh.blocking.domain.shared.JpaDomainEntity
import org.josh.blocking.domain.student.JpaStudent
import org.josh.domain.course.CourseGrade
import org.josh.domain.course.CourseReport
import javax.persistence.*

@Entity
@Table(name = "course_report")
class JpaCourseReport(
    @OneToOne
    @JoinColumn(name = "student_id")
    override val student: JpaStudent,

    override val courseGrade: CourseGrade
) : JpaDomainEntity(), CourseReport {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    val course: JpaCourse = JpaCourse()
}
