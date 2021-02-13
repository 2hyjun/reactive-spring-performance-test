package org.josh.blocking.domain.course

import org.josh.blocking.domain.shared.JpaDomainEntity
import org.josh.domain.course.Course
import javax.persistence.Entity
import javax.persistence.Table

/**
 * R2dbc가 relational mapping을 지원하지 않아서,, 맞춰주려고,,,
 */

@Entity
@Table(name = "course")
class JpaCourse2(
    override var id: Long,
    override val name: String
) : JpaDomainEntity(), Course {

}