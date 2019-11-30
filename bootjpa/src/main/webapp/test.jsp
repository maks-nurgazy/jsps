<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Saving an </title>
</head>
<body>

    <form action="addAlien">
        <label>
            <input type="text" name="aid" placeholder="Enter aid">
        </label><br>
        <label>
            <input type="text" name="aname" placeholder="Enter aname">
        </label><br>
        <label>
            <input type="text" name="tech" placeholder="Enter tech">
        </label><br>
        <input type="submit"><br>
    </form>


    <form action="getAlien">
        <label>
            <input type="text" name="aid" placeholder="get aid">
        </label><br>
        <input type="submit"><br>
    </form>

</body>
</html>