package com.khughes

class Student {
String name
String email
String username
String password
String studentId
Course course
    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false
username blank:false, nullable:false
password blank:false, nullable:false
studentId blank:false, nullable:false
course blank:false, nullable:false
    }
}
