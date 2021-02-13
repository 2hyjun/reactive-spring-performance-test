package org.josh.nonblocking.domain.shared

import org.josh.domain.shared.DomainEntity
import org.springframework.data.annotation.Id

abstract class R2dbcDomainEntity : DomainEntity {
    @Id
    override var id: Long = -1
}