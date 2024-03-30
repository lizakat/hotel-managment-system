<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Services</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">SERVICE</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/service/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Type</th>
                <th>Cost</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="type" name="type"></td>
                <td><input type="text" id="cost" name="cost"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/service/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Service ID</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="serviceId" name="serviceId" value=""></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Delete</button><br><br>
    </form>
</div>

<table>
    <thead>
    <tr>
        <th>Service ID</th>
        <th>Type</th>
        <th>Cost</th>
    </tr>
    </thead>
    <tbody>
    <#list services as service>
        <tr>
            <td>${service.serviceId}</td>
            <td>${service.type}</td>
            <td>${service.cost}</td>
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
