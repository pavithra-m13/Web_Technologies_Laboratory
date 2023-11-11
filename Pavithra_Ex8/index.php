<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fruits Catalog</title>
    <style>
        body {
            font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 20px;
            text-align: center;
            background-color: rgb(11, 197, 11);
        }

        h2 {
            font-size:30px;
            color: #333;
        }

        .fruit-container {
            width: 30%; 
            height: 60%; 
            margin: 10px;
            background-color: white;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
            display: inline-block; 
            vertical-align: top;
        }

        .fruit-name {
            font-size: 50px;
            font-weight: bold;
            color:green;
        }

        .fruit-details {
            margin-top: 10px;
            font-size:30px;
        }
    </style>
</head>

<body>
    <?php
    $xmlFile = 'fruits_catalog.xml';

    if (file_exists($xmlFile)) {
        $xml = simplexml_load_file($xmlFile);

        if ($xml) {
            echo "<h2>Fruits Catalog</h2>";

            foreach ($xml->fruit as $fruit) {
                $fruitName = (string)$fruit->name;
                $fruitColor = (string)$fruit->color;
                $fruitTaste = (string)$fruit->taste;
                $fruitPrice = (string)$fruit->price;

                echo "<div class='fruit-container'>";
                echo "<div class='fruit-name'>$fruitName</div>";
                echo "<div class='fruit-details'>";
                echo "<p><strong>Color:</strong> $fruitColor</p>";
                echo "<p><strong>Taste:</strong> $fruitTaste</p>";
                echo "<p><strong>Price:</strong> $fruitPrice</p>";
                echo "</div>";
                echo "</div>";
            }
        } else {
            echo "Error loading XML";
        }
    } else {
        echo "XML file not found";
    }
    ?>
</body>

</html>
