package org.josh.domain.course

import org.josh.domain.student.Student

interface CourseReport {
    val student: Student
    val courseGrade: CourseGrade

//    val course: Course
}