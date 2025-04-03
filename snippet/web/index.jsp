<%-- 
    Document   : index
    Created on : 2 Apr 2025, 11:57:30 pm
    Author     : LENOV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Snippet Manager</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">s
</head>
<body>

    <h2 style="text-align:center;">Submit a Code Snippet</h2>
    
    <form action="snippet_details" method="POST">
        <label for="title">Title:</label>
        <input type="text"  name="title" placeholder="Snippet title" required/>

        <label for="language">Language:</label>
        <select id="language" name="language" required>
            <option value="java">Java</option>
            <option value="python">Python</option>
            <option value="javascript">JavaScript</option>
            <option value="php">PHP</option>
        </select>

        <label for="description">Description:</label>
        <textarea  name="des" rows="4" placeholder="Snippet description" required></textarea>

        <label for="code">Code:</label>
        <textarea  name="code" rows="10" placeholder="Write your code here..." required></textarea>

        <label for="tag">Tags:</label>
        <input type="text"  name="tage" placeholder="e.g., Java, Algorithm, OOP"/>

        <input type="submit" value="Submit"/>
    </form>

</body>
</html>
