
<html>
<head>
    <script type="text/javascript" src="mule-resource/js/mule.js"></script> 
    <script type="text/javascript">
    
        function rpcCallMuleEcho() { 
            // Create a new object and populate it with the request data
            var data = new Object();
            data.phrase = document.getElementById('phrase').value;
            // Send the data to the mule endpoint and set a callback to handle the response.
            // The "mule" element is provided by the Mule JavaScript client.
            mule.rpc("/services/catalog", data, rpcEchoResponse); 
        }

        // Display response message data.
        function rpcEchoResponse(message) {
            document.getElementById("message").innerHTML = "<b>Response:&nbsp;</b>" + message.data + "\n";
        }
    </script>
</head>
<body link="#FFFFFF" vlink="#FFFFFF" alink="#FFFFFF" bgcolor="#990000" text="#FFFFFF">

<center>
<form method="POST" name="multiplication" action="services/catalog">
    <table>
        <tr>
            <td>Title: </td>
            <td><input id ="phrase" type="text" name="phrase"/></td>
        </tr>
    </table>
    <input type="button"  name="Submit" value="submit" onclick="rpcCallMuleEcho()">
</form>
<p>message:<span id="message"></span>
 
  </p>
  <p>&nbsp;</p>
</center>
</body>
</html>
