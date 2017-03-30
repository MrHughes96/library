package com.khughes

class StudentController {

    def scaffold = Student

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
