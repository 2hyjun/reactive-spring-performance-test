package org.josh.blocking.domain.course

import org.josh.blocking.domain.professor.JpaProfessor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface CourseRepository : JpaRepository<JpaCourse, Long> {

    @Query(
        """
        SELECT c FROM JpaCourse c
        JOIN FETCH c.professor as p
        JOIN FETCH c.courseReports as cp
        JOIN FETCH cp.student as s
        WHERE p = :professor
    """
    )
    fun findAllByProfessor(@Param("professor") professor: JpaProfessor): List<JpaCourse>
}
