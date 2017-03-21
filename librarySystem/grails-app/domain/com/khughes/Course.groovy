package com.khughes
/*attributes*/
class Course {
String title
String code
String leader
String department
String description
String studyMode
double fees

double calculateFees(){
3*fees
}


/*constraints*/
    static constraints = {
title blank:false, nullable:false
code blank:false, nullable:false
leader blank:false, nullable:false
department blank:false, nullable:false
description blank:false, nullable:false
studyMode blank:false, nullable:false
fees blank:false,nullable:false, scale:2

    }
}
