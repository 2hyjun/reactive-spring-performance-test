package org.josh.nonblocking.domain.professor

import org.josh.domain.professor.Professor
import org.josh.nonblocking.domain.shared.R2dbcDomainEntity
import org.springframework.data.relational.core.mapping.Table

@Table("professor")
data class R2dbcProfessor(
    override var id: Long,
    override val name: String
) : R2dbcDomainEntity(), Professor