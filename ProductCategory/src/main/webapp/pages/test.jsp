<html>
     <head>
         <title> app </title>
         <script>
                var xmlhttp;
                function change(){
                	xmlhttp=new XMLHttpRequest();
                	xmlhttp.onload=show;
                	var pid = document.form1.pid.value;
                	xmlhttp.open("get", "http://localhost:8080/demo/");
                	xmlhttp.send();
                }
                function show(){
                	alert(xmlhttp.responseText);
                	document.getElementById("heading1").innerHTML=xmlhttp.responseText;
                	
                }
         </script>
     </head>
     <body>
          <form name="form1">
           <h1 id="heading1"> welcome </h1>
           <input type="text" name="pid" placeholder="product id"> <br>
           <input type="text" name="pname" placeholder="product name"> <br>
           <input type="text" name="price" placeholder="product price"> <br>
           
           <input type="button" value="Click me" onclick="change()">
           </form>
     </body>

</html>