package org.josh.nonblocking.interfaces.boundaries

import kotlinx.coroutines.delay
import org.josh.nonblocking.application.ProfessorCourseService
import org.josh.nonblocking.interfaces.dto.ProfessorCoursesDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
class ProfessorRestController(
    private val professorCourseService: ProfessorCourseService
) {
    @GetMapping("/professor/{id}")
    suspend fun get(@PathVariable id: Long): ProfessorCoursesDto {
        return professorCourseService.getCourse(id)
    }

    @GetMapping("/dummy/suspend")
    suspend fun dummy() {
        delay(2)
    }

    @GetMapping("/dummy/reactor")
    fun dummyReactor(): Mono<Long> {
        return Mono.delay(Duration.ofMillis(2))
    }
}