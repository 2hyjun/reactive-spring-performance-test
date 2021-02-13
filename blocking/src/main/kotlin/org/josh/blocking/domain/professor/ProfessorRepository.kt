package org.josh.blocking.domain.professor

import org.springframework.data.jpa.repository.JpaRepository

interface ProfessorRepository : JpaRepository<JpaProfessor, Long>
