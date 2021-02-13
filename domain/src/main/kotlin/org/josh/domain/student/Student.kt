package org.josh.domain.student

import org.josh.domain.shared.DomainEntity

interface Student : DomainEntity {
    val name: String
    val grade: StudentGrade
}