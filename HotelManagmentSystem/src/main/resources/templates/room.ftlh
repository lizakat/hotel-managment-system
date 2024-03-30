<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rooms</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">ROOM</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/room/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Number</th>
                <th>Bed Capacity</th>
                <th>Type</th>
                <th>Price per Night</th>
                <th>Floor Number</th>
                <th>Booking Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="number" name="number"></td>
                <td><input type="text" id="bedCapacity" name="bedCapacity"></td>
                <td><input type="text" id="type" name="type"></td>
                <td><input type="text" id="pricePerNight" name="pricePerNight"></td>
                <td><input type="text" id="floorNumber" name="floorNumber"></td>
                <td><input type="text" id="bookingNumber" name="bookingNumber"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/room/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Number</th>
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
        <th>Number</th>
        <th>Bed Capacity</th>
        <th>Type</th>
        <th>Price per Night</th>
        <th>Floor Number</th>
        <th>Booking Number</th>
    </tr>
    </thead>
    <tbody>
    <#list rooms as room>
        <tr>
            <td>${room.number}</td>
            <td>${room.bedCapacity}</td>
            <td>${room.type}</td>
            <td>${room.pricePerNight}</td>
            <td>${room.floorNumber}</td>
            <td>${room.bookingNumber}</td>
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
