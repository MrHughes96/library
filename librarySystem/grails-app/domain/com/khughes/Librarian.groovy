package com.khughes

class Librarian {
String name
String email
String office
String username
String password
int telephone
Library library
static belongsTo= Library
String toString(){name}

    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
office blank:false, nullable:false
username blank:false,nullable:false,unique:true
password blank:false,nullable:false,password:true
telephone blank:false, nullable:false
library blank:false, nullable:false
    }
}
