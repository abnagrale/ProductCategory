<html>
      <head>
           <title> API Call </title>
           <script> 
                  var xmlhttp;
                  function getall(){
                	  xmlhttp=new XMLHttpRequest();
                	  xmlhttp.onload=show1;
                	  xmlhttp.open("get" , "http://localhost:8080/product");
                	  xmlhttp.send();
                  }
                  
                  function show1(){
                	  alert(xmlhttp.responseText);
                	  document.getElementById("1").innerHTML=xmlhttp.responseText;
                  }
           
           </script>
      </head>
      <body>
           <h1 id="1"> Product Details </h1>
           <form name="form1">
               <input type="text" name="pid" placeholder="Product ID"> <br> <br>
               <input type="text" name="pname" placeholder="Product Name"><br> <br>
               <input type="text" name="price" placeholder="Product Price"><br> <br>
               
               <input type="button" value="Get" onclick="get()"> 
               <input type="button" value="Post" onclick="post()"> 
               <input type="button" value="Update" onclick="update()"> 
               <input type="button" value="Delete" onclick="delete()"> 
               <input type="button" value="Get ALL" onclick="getall()"> 
           </form>
           
      </body>

</html>