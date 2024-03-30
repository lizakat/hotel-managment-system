<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Service Relationships</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div style="display: flex; align-items: center;">
    <a href="/" class="back-button">&larr; HOME</a>
    <h1 style="margin-left: auto; margin-right: auto;">SERVICE RELATIONSHIPS</h1>
</div>

<button class="add-button" onclick="toggleFormAdd()">Add</button>
<button class="delete-button" onclick="toggleFormDel()">Delete</button><br>

<div class="form-container-add" style="display: none;">
    <form action="/servicerelationships/add" method="POST">
        <table>
            <thead>
            <tr>
                <th>Passport Number</th>
                <th>Employment Book Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="passportNumber" name="passportNumber"></td>
                <td><input type="text" id="employmentBookNumber" name="employmentBookNumber"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="button">Save</button><br><br>
    </form>
</div>

<div class="form-container-del" style="display: none;">
    <form action="/servicerelationships/delete" method="POST">
        <table>
            <thead>
            <tr>
                <th>Passport Number</th>
                <th>Employment Book Number</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" id="passportNumber" name="passportNumber"></td>
                <td><input type="text" id="employmentBookNumber" name="employmentBookNumber"></td>
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
        <th>Employment Book Number</th>
    </tr>
    </thead>
    <tbody>
    <#list serviceRelationships as serviceRelationship>
        <tr>
            <td>${serviceRelationship.passportNumber}</td>
            <td>${serviceRelationship.employmentBookNumber}</td>
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
