package org.josh.blocking.domain.student

import org.josh.blocking.domain.shared.JpaDomainEntity
import org.josh.domain.student.Student
import org.josh.domain.student.StudentGrade
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "student")
class JpaStudent(
    override val name: String,
    override val grade: StudentGrade
) : JpaDomainEntity(), Student
