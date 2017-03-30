package com.khughes

class BookReview {
Book book
Date dateofreview
Student student
String review

    static constraints = {
book blank:false, nullable:false
dateofreview blank:false, nullable:false
student blank:false, nullable:false
review blank:false, nullable:false
    }
}
