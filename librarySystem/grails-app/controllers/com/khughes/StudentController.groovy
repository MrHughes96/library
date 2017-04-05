package com.khughes

class StudentController {

    def scaffold = Student

def search(){
}
def results(String name){
def students=Student.where{
name=~name
}.list()
return [students:students,
	term:params.name,
	totalStudents:Student.count()]
}
def advSearch(){
}
def advResults(){
def studentProps=Student.metaClass.properties*.name
def students=Student.withCriteria{
"${params.queryType}"{
params.each{field,value->
if (studentProps.grep(field)&&value){
ilike(field,value)
}
}
}
}
[students:students]
}
def advBookSearch(){
}
def advBookResults(){
def bookProps=Book.metaClass.properties*.name
def books=Book.withCriteria{
"${params.queryType}"{
params.each{field,value->
if (bookProps.grep(field)&&value){
ilike(field,value)
}
}
}
}
[books:books]
}
def studentlogin(){
}
def validate(){
def user = Student.findByUserName(params.username)
if(user && user.password == params.password){
session.user = user
render view:'studenthome'
}
else{
flash.message = "Invalid Username and Password."
render view: 'studentlogin'
}
}
def logout = {
session.user = null
redirect(uri:'/')


}



















}
