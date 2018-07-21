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
    $num = intval($_GET['num']);
    $prime = range(2, $num);
    foreach ($prime as $key => $value) {
        for ($i = 2; $i < $value; $i++) {
            if (is_int($value / $i)) {
                unset($prime[$key]);
                break;
            }
        }
    }
    $result = array_reverse($prime);
    foreach ($result as $value) {
        echo "$value ";
    }
}
?>
</body>
</html>