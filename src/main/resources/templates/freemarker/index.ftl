<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
<h3>在线考试系统</h3>
<form method="post" action="#">
    <input name="username" placeholder="请输入账户" />
    <br>
    <input name="password" placeholder="请输入密码" />
    <br>
    <select name="status">
        <option value="student">--请选择身份--</option>
        <option value="teacher">--老师--</option>
        <option value="student">--学生--</option>
        <option value="admin">--管理员--</option>
    </select>
    <br>
    <input type="submit"/>
    <input type="reset"/>
</form>
</body>
</html>
