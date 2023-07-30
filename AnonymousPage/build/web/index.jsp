<%@include file="header.jsp" %>
<div class="row">
    <div class="col-sm-12 col-xs-12 col-md-4 col-lg-4">
    
    </div>
    <div class="col-sm-12 col-xs-12 col-md-4 col-lg-4">
            
        <form action="valAction" class=" form-control " method="post" >
            <img src="images/login.png" width="100%" height="100%" class="img-fluid">
        <table class="table">
            <tr><td class="rightText"><label for="user">User I'd:</label></td><td><input id="user" type="text" placeholder="User Type Here....." name="user" class="form-control" required></td></tr>
            <tr><td class="rightText"><label for="pass">Password:</label></td><td><input id="pass" type="password" placeholder="Password Type Here....." name="pass" class="form-control"required></td></tr>
            <tr><td colspan="2"><center>
                    <input type="submit" class="btn-primary">
                    <input type="reset" class="btn-danger"></center>
           </tr>
           ${msg}
        </table>
            <a href="signup.jsp">SignUp</a> | 
            <a href="forgetpass">Forget Password</a>
        </form>
    </div>
</div>
<%@include file="footer.jsp" %>