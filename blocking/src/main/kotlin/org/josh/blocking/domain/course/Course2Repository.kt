package org.josh.blocking.domain.course

import org.josh.blocking.domain.professor.JpaProfessor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface Course2Repository: JpaRepository<JpaCourse2, Long> {

    @Query(
        """
        select c.id, c.name
        from course c
                 inner join professor p on p.id = c.professor_id
                 inner join course_report cr on c.id = cr.course_id
                 inner join student s on s.id = cr.student_id
        where c.professor_id = :#{#professor.id}
    """, nativeQuery = true
    )
    fun findAllByProfessor(@Param("professor") professor: JpaProfessor): List<JpaCourse2>
}
