<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOTEL MANAGEMENT SYSTEM</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            font-size: 22px;
            text-align: center;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        h1 {
            font-size: 40px;
            margin-bottom: 30px;
            color: #333;
        }

        .button-container {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            grid-gap: 20px;
            justify-content: center;
            align-items: center;
            height: 70vh;
        }

        .myButton {
            padding: 40px 40px;
            font-size: 18px;
            background-color: #588bc4;
            color: #fff;
            text-decoration: none;
            border-radius: 12px;
            border: none;
            transition: background-color 0.3s, color 0.3s;
        }

        .myButton:hover {
            background-color: #0056b3;
        }

        @media screen and (max-width: 768px) {
            .button-container {
                grid-template-columns: repeat(2, 1fr);
            }
        }

        @media screen and (max-width: 480px) {
            .button-container {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>
<body>
<h1>HOTEL MANAGEMENT SYSTEM</h1>
<div class="button-container">
    <a href="/floor" class="myButton">FLOOR</a>
    <a href="/room" class="myButton">ROOM</a>
    <a href="/client" class="myButton">CLIENT</a>
    <a href="/employee" class="myButton">EMPLOYEE</a>
    <a href="/position" class="myButton">POSITION</a>
    <a href="/service" class="myButton">SERVICE</a>
    <a href="/providedservice" class="myButton">PROVIDED SERVICE</a>
    <a href="/booking" class="myButton">BOOKING</a>
    <a href="/servicerelationships" class="myButton">SERVICE RELATIONSHIPS</a>
</div>
</body>
</html>
