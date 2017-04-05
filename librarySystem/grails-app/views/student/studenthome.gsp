<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the Student Library System</title>
<asset:stylesheet src="home.css"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>


    <div id="content" role="main">
<div class="row">


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
	<h3>Book Search</h3>
<p>This button takes you to the book Advanced Search screen</p>
	<button type="button" class="btn btn-success">
	<g:link controller="student"action="advBookSearch">Search for Books</g:link>
	</button>
</div>


