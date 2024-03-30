<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Provided Services</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">PROVIDED SERVICE</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/providedservice/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Date</th>
                <th>Passport Number</th>
                <th>Service ID</th>
                <th>Quantity</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="date" id="date" name="date"></td>
                <td><input type="text" id="passportNumber" name="passportNumber"></td>
                <td><input type="text" id="serviceId" name="serviceId"></td>
                <td><input type="text" id="quantity" name="quantity"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/providedservice/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Passport Number</th>
                <th>Service ID</th> <!-- Добавляем поле для Service ID -->
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="passportNumber" name="passportNumber"></td>
                <td><input type="text" id="serviceId" name="serviceId"></td> <!-- Добавляем поле для Service ID -->
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Delete</button><br><br>
    </form>
</div>

<table>
    <thead>
    <tr>
        <th>Date</th>
        <th>Passport Number</th>
        <th>Service ID</th>
        <th>Quantity</th>
    </tr>
    </thead>
    <tbody>
    <#list providedServices as providedService>
        <tr>
            <td>${providedService.date}</td>
            <td>${providedService.passportNumber}</td>
            <td>${providedService.serviceId}</td>
            <td>${providedService.quantity}</td>
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
