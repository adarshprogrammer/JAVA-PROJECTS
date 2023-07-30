<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="container-fluid nav">
<span class="mainuser">&#128104; ${id}</span>
    <span class="mode">${mode}</span>
    <span class="greet">Welcome my Anonymous page</span>
    <div class="dropdown">
        <center><button class="dropdown-toggle" type="button" data-toggle="dropdown">
            <span class="caret">Select Update | Sign Out</span></button>
                <ul class="dropdown-menu">
                    <li><a href="./update.jsp" class="updateProfile"><u>Update Profile</u></a> </li>
                  <li><a href="SessionOut" class="updateProfile signout"><u>Sign Out</u></a></li>
                </ul>
    </div>
    
  
    
</div>
    <div><marquee><img src="./images/login.png" width="500px" height="500px" class="img-fluid"></marquee></div>
<%@include file="footer.jsp" %>