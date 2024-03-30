<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Booking</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">BOOKING</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>
<div class="form-container-add" style="display: none;">
    <form action="/booking/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Number</th>
                <th>Booking Date</th>
                <th>Check-in Date</th>
                <th>Check-out Date</th>
                <th>Passport Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="addNumber" name="number"></td>
                <td><input type="date" id="bookingDate" name="bookingDate"></td>
                <td><input type="date" id="checkInDate" name="checkInDate"></td>
                <td><input type="date" id="checkOutDate" name="checkOutDate"></td>
                <td><input type="text" id="passportNumber" name="passportNumber"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>


<div class="form-container-del" style="display: none;">
    <form action="/booking/delete" method="POST">
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
            <th>Booking Date</th>
            <th>Check-in Date</th>
            <th>Check-out Date</th>
            <th>Passport Number</th>
        </tr>
    </thead>
    <tbody>
        <#list bookings as booking>
            <tr>
                <td>${booking.number}</td>
                <td>${booking.bookingDate}</td>
                <td>${booking.checkInDate}</td>
                <td>${booking.checkOutDate}</td>
                <td>${booking.passportNumber}</td>
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
