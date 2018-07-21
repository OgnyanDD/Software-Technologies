<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {

    $numb = intval($_GET['num']);

    for ($i = $numb; $i > 0; $i--) {

        if ($numb % $i != 0) {
            echo "$i ";
        }
    }
}
?>
</body>
</html>