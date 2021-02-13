package org.josh.domain.course

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class CourseGrade(@get: JsonValue val courseGradeId: Int) {
    `A+`(1),
    `A0`(2),
    `A-`(3),
    `B+`(4),
    `B0`(5),
    `B-`(6),
    `C+`(7),
    `C0`(8),
    `C-`(9),
    `D+`(10),
    `D0`(11),
    `D-`(12);

    companion object {
        private val gradeIdMap = values().associateBy(CourseGrade::courseGradeId)
        private val nameMap = values().associateBy(CourseGrade::name)

        @JvmStatic
        @JsonCreator
        fun of(courseGradeId: Int) = gradeIdMap[courseGradeId]

        fun of(name: String) = nameMap[name]
    }

}
