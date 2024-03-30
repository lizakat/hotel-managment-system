<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">CLIENT</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/client/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Passport Number</th>
                <th>Name</th>
                <th>Phone Number</th>
                <th>Room Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="passportNumber" name="passportNumber"></td>
                <td><input type="text" id="name" name="name"></td>
                <td><input type="text" id="phoneNumber" name="phoneNumber"></td>
                <td><input type="text" id="roomNumber" name="roomNumber"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/client/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Passport Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="number" name="number"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Delete</button><br><br>
    </form>
</div>

<table>
    <thead>
    <tr>
        <th>Passport Number</th>
        <th>Name</th>
        <th>Phone Number</th>
        <th>Room Number</th>
    </tr>
    </thead>
    <tbody>
    <#list clients as client>
        <tr>
            <td>${client.passportNumber}</td>
            <td>${client.name}</td>
            <td>${client.phoneNumber}</td>
            <td>${client.roomNumber}</td>
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
