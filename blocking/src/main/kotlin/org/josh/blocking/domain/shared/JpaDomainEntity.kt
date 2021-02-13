package org.josh.blocking.domain.shared

import org.josh.domain.shared.DomainEntity
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class JpaDomainEntity : DomainEntity {
    @Id
    override val id: Long = -1
}
