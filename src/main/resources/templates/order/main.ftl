<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="/order/doOrder">
        <select name="orderType">
        <#list list as item>
            <option value="${item.value}">${item.name}</option>
        </#list>
        </select>
        <input name="numbers"/>
        <button type="submit">submit</button>
    </form>


</body>
</html>