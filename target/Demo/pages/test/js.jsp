<%--
  Created by IntelliJ IDEA.
  User: BieFeNg
  Date: 2018/5/11
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script>
        var arr = Array.from([1, 2, 3], x => x * 3);
        console.log(arr);

        console.log(Array.isArray(arr));
        var a = -13.5;
        console.log(Math.abs(a));
        console.log(Math.pow(2, 3));
        console.log(Math.floor(Math.abs(a)));
        console.log(Math.ceil(Math.abs(a)));
        var se = new Set(['a', window, window]);

        console.log(se);
        var ma = new Map([['ab', 2], ['bc', 3]]);
        console.log(ma);
        console.log(ma.get("ab"));
        console.log(Array.of("", "", "", ""))
        console.log(Array(7));
        var iterator1 = arr.entries();
        console.log(iterator1.next().value);
        console.log(iterator1.next().value);
        for (let a of iterator1) {
            console.log(a);
        }
        console.log(arr.every(function (value) {
            return value > 0;
        }));

       /* for(let s=1;s<10;s++){
            console.log(s)
        }
        console.log(s);*/
        var c=[];
        for(let i=0;i<10;i++){
            c[i]=function(){
                console.log(i);
            }
        }
        c[6]();

        for(let i=0;i<3;i++){
            let i="abv";
            console.log(i);
        }
        console.log
    </script>
</head>
<body>

</body>
</html>
