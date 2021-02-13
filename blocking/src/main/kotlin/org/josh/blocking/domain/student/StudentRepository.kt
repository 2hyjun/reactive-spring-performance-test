package org.josh.blocking.domain.student

import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<JpaStudent, Long>
