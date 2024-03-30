<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Floors</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">FLOOR</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/floor/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Number</th>
                <th>Total Number of Rooms</th>
                <th>Number of Available Rooms</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="addNumber" name="number"></td>
                <td><input type="text" id="totalNumberOfRooms" name="totalNumberOfRooms"></td>
                <td><input type="text" id="numberOfAvailableRooms" name="numberOfAvailableRooms"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/floor/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="addNumber" name="number"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Delete</button><br><br>
    </form>
</div>


<table>
    <thead>
    <tr>
        <th>Number</th>
        <th>Total Number of Rooms</th>
        <th>Number of Available Rooms</th>
    </tr>
    </thead>
    <tbody>
    <#list floors as floor>
        <tr>
            <td>${floor.number}</td>
            <td>${floor.totalNumberOfRooms}</td>
            <td>${floor.numberOfAvailableRooms}</td>
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
