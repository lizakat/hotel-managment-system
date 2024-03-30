<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Positions</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">POSITION</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/position/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Name</th>
                <th>Salary</th>
                <th>Working Hours</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="name" name="name"></td>
                <td><input type="text" id="salary" name="salary"></td>
                <td><input type="time" id="workingHours" name="workingHours"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/position/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Position ID</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="positionId" name="positionId"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Delete</button><br><br>
    </form>
</div>

<table>
    <thead>
    <tr>
        <th>Position ID</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Working Hours</th>
    </tr>
    </thead>
    <tbody>
    <#list positions as position>
        <tr>
            <td>${position.positionId}</td>
            <td>${position.name}</td>
            <td>${position.salary}</td>
            <td>${position.workingHours}</td>
        </tr>
    </#list>
    </tbody>
</table>

<script>
    function toggleFormAdd() {
        var form = document.querySelector('.form-container-add');
        form.style.display = form.style.display === 'none' ? 'block' : 'none';
    }
    function toggleFormDel() {
        var form = document.querySelector('.form-container-del');
        form.style.display = form.style.display === 'none' ? 'block' : 'none';
    }
</script>

</body>
</html>
