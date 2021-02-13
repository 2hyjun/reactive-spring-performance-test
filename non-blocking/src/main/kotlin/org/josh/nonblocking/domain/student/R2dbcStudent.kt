package org.josh.nonblocking.domain.student

import org.josh.domain.student.Student
import org.josh.domain.student.StudentGrade
import org.josh.nonblocking.domain.shared.R2dbcDomainEntity
import org.springframework.data.relational.core.mapping.Table

@Table("student")
class R2dbcStudent(
    override var id: Long,
    override val name: String,
    override val grade: StudentGrade
) : R2dbcDomainEntity(), Student