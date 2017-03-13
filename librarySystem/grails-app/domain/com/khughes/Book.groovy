package com.khughes

class Book {
String title
String subject
String author
int isbn
Date dateBorrowed
Date returnDate
String Student
Boolean overdue

    static constraints = {
title blank:false, nullable:false
subject blank:false, nullable:false
author blank:false, nullable:false
isbn blank:false, nullable:false
dateBorrowed blank:false, nullable:false
returnDate blank:false, nullable:false
Student blank:false, nullable:false
overdue blank:false, nullable:false
    }
}
