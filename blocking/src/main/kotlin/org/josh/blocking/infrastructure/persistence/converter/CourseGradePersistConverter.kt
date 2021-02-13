package org.josh.blocking.infrastructure.persistence.converter

import org.josh.domain.course.CourseGrade
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class CourseGradePersistConverter : AttributeConverter<CourseGrade, Int> {
    override fun convertToDatabaseColumn(attribute: CourseGrade) = attribute.courseGradeId

    override fun convertToEntityAttribute(dbData: Int): CourseGrade = CourseGrade.of(dbData) ?: throw IllegalStateException("Illegal Course Grade Id : $dbData")
}