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
    $a = 0;
    $b = 1;
    $c = 0;
    echo '1 ';
    for ($i = 2; $i <= $num; $i++) {
        $c = $a + $b;
        $a = $b;
        $b = $c;
        echo "$b ";
    }
}
?>
</body>
</html>