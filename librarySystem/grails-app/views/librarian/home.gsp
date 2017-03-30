<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Library System</title>
<asset:stylesheet src="home.css"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>


    <div id="content" role="main">
<div class="row">

<div class="first">
	<h3>Libraries Management</h3>
<p>This button takes you to the library management screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="library"action="create">Libraries</g:link>
	</button>
</div>
<div class="second">
	<h3>Librarian Management</h3>
<p>This button takes you to the librarian management screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="librarian"action="create">Librarians</g:link>
	</button>
</div>

<div class="first">
	<h3>Book Management</h3>
<p>This button takes you to the book management screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="book"action="create">Books</g:link>
	</button>
</div>

<div class="second">
	<h3>Book Review Management</h3>
<p>This button takes you to the book review management screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="bookReview"action="create">Book Reviews</g:link>
	</button>
</div>

<div class="first">
	<h3>Course Management</h3>
<p>This button takes you to the course management screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="course"action="create">Courses</g:link>
	</button>
</div>

<div class="second">
	<h3>Student Management</h3>
<p>This button takes you to the student management screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="student"action="create">Students</g:link>
	</button>
</div>
