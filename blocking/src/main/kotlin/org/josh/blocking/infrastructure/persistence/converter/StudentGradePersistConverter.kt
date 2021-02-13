package org.josh.blocking.infrastructure.persistence.converter

import org.josh.domain.student.StudentGrade
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class StudentGradePersistConverter : AttributeConverter<StudentGrade, Int> {
    override fun convertToDatabaseColumn(attribute: StudentGrade): Int = attribute.gradeId

    override fun convertToEntityAttribute(dbData: Int): StudentGrade = StudentGrade.of(dbData) ?: throw IllegalStateException("Illegal Grade Id : $dbData")
}