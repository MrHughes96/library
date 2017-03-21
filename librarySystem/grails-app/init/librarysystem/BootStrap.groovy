package com.khughes

class BootStrap {

    def init = { servletContext ->
/*   
def seacombe = new Library(
name: 'Seacombe Library',
address: '34 Seacombe Way, Wallasey',
openingHours:'10-5',
location: 'Wallasey',
studySpaces:'53')
.save()

def earlston = new Library(
name: 'earlston Library',
address: '1 Earlston Road, Wallasey',
openingHours:'10-5',
location: 'Wallasey',
studySpaces:'70')
.save()

def kyle = new Librarian(
name: 'Kyle Hughes',
email: 'khughes@hotmail.co.uk',
office: 's123',
username: 'k.hughes',
password: 'password',
telephone: '01515138930',
library: earlston)
.save()

def John = new Librarian(
name: 'John Doe',
email: 'jdoe@hotmail.co.uk',
office: 's124',
username: 'j.doe',
password: 'password',
telephone: '01145138930',
library: seacombe)
.save()

def computing = new Course(
title: 'BSc Computing',
code: 'g403',
leader: 'Lynne Dawson',
department: 'Aces',
description: 'The SHU Computing Course',
studyMode: 'Full Time')
.save()

def animation = new Course(
title: 'BA Animation',
code: 'an133',
leader: 'Melvin Jones',
department: 'Aces',
description: 'The SHU Animation Course',
studyMode: 'Full Time')
.save()

def amy = new Student(
name: 'Amy Moody',
email: 'b4001234@my.shu.ac.uk',
username: 'a.moody',
password: 'password',
studentId: 'b4001234',
course: computing)
.save()

def ryan = new Student(
name: 'Ryan Johnson',
email: 'b4011234@my.shu.ac.uk',
username: 'r.johnson',
password: 'password',
studentId: 'b4011234',
course: animation)
.save()




def catch22 = new Book(
title: 'Catch 22',
subject: 'War',
author: 'Joseph Heller',
isb: '001',
dateBorrowed: new Date ('01/01/2017'),
returnDate: new Date ('25/01/2017'),
student: ryan,
overdue:false)
.save()

def winorlearn = new Book(
title: 'Win or Learn',
subject: 'sports',
author: 'John Kavanagh',
isb: '002',
dateBorrowed: new Date ('11/05/2017'),
returnDate: new Date ('03/07/2017'),
student: amy,
overdue:false)
.save()




def catch22review = new BookReview(
book: catch22,
dateCreated: new Date ('01/01/2017'),
student: ryan,
review: '80/100')
.save()

def winorlearnreview = new BookReview(
book: winorlearn,
dateCreated: new Date ('11/02/2017'),
student: amy,
review: '75/100')
.save()

earlston.addToBooks(catch22)
seacombe.addToBooks(catch22)
seacombe.addToBooks(winorlearn)
earlston.addToBooks(winorlearn)
catch22.addToLibrarys(earlston)
catch22.addToLibrarys(seacombe)
winorlearn.addToLibrarys(earlston)
winorlearn.addToLibrarys(seacombe)

seacombe.addToLibrarians(kyle)
seacombe.addToLibrarians(John)
earlston.addToLibrarians(kyle)
earlston.addToLibrarians(John)

amy.addToBooks(catch22)
amy.addToBooks(winorlearn)
ryan.addToBooks(catch22)
ryan.addToBooks(winorlearn)


*/

 }

    def destroy = {
    }
}
