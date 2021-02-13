package org.josh.nonblocking.domain.course

import org.josh.nonblocking.domain.professor.R2dbcProfessor
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.query.Param

interface CourseRepository : R2dbcRepository<R2dbcCourse, Long> {
    @Query(
        """
        select c.id, c.name
        from course c
                 inner join professor p on p.id = c.professor_id
                 inner join course_report cr on c.id = cr.course_id
                 inner join student s on s.id = cr.student_id
        where c.professor_id = :#{#professor.id}
    """
    )
    suspend fun findAllByProfessor(@Param("professor") professor: R2dbcProfessor): List<R2dbcCourse>
}