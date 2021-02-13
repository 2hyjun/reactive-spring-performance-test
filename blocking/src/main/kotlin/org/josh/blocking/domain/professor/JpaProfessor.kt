package org.josh.blocking.domain.professor

import org.josh.blocking.domain.shared.JpaDomainEntity
import org.josh.domain.professor.Professor
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "professor")
class JpaProfessor(
    override val name: String
) : JpaDomainEntity(), Professor {
    constructor() : this("")
}
