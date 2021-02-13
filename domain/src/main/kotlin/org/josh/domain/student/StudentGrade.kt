package org.josh.domain.student

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class StudentGrade(@get:JsonValue val gradeId: Int) {
    FRESHMAN(1),
    SOPHOMORE(2),
    JUNIOR(3),
    SENIOR(4);

    companion object {
        private val map = values().associateBy(StudentGrade::gradeId)

        @JvmStatic
        @JsonCreator
        fun of(gradeId: Int) = map[gradeId]
    }

}
