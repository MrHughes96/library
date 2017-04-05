<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Library System Advanced Book Search</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<div class="row">
	<h1>Library System Advanced Book Search</h1>
	<h3>Advanced Book search  Results</h3>
<p>Searched for books matching <em>${term}</em>.
Found<strong>${books.size()}</strong> books.
</p>
<ul>
	<g:each var="book" in="${books}">
	<li><g:link controller="book" action="show"
id="${book.id}">${book.title}</g:link></li>
	</g:each>
</ul>
	<g:link action='advBookSearch'>Search Again</g:link>
</div>
</body>
</html>

