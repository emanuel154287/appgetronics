<%-- 
    Document   : Sign Up
    Author     : emanuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
        <!-- Tema opcional -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">
        <!-- JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>    
    </head>
    
    <body>
        <div class="container">
            <form action="User" method="POST">
                <div class="form-row">
                  <div class="form-group col-md-6">
                    <label>Name</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Enter your name" required>
                  </div>
                   <div class="form-group col-md-5"> 
                        <label for="inputAddress">Email Adress</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="exemple@icloud.com" required>
                   </div>
                </div>
                
                <div class="form-row">
                    <div class="form-group col-md-6"> 
                        <label>Company &#40;Opcional&#41;</label>
                        <input type="text" class="form-control" id="company" name="company" placeholder="Company SA">
                    </div>
                   <div class="form-group col-md-5">
                       <button id="submit"type="submit" class="btn btn-primary">Sign up</button>
                   </div>
                </div>
              </form>
        </div>
 
    </body>
</html>
