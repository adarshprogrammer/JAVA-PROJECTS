<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<div class="row">
    <div class="col-sm-12 col-xs-12 col-md-2 col-lg-2"></div>
    <div class="col-sm-12 col-xs-12 col-md-8 col-lg-8"><br>
        <h1><center>Anonymous User</center></h1>
<marquee class="marquee">यही जज्बा रहा तो मुस्किलो का हल भी निकलेगा, जमीन बंजर हुई तो क्या वही  से जल भी निकलेगा 
    , न हो मायुस न घबरा अँधेरे से मेरे साथी, इन्ही रातो की दामन में सुनहरा कल भी निकलेगा | </marquee>

        <form action="registerAction" class=" form-control " method="post">

            <table class="table table-sm  table-striped ">
                <tr><td><label for="user" class="rightText">User I'd:</label></td>
                    <td><input id="user" type="text" placeholder="User Type Here....." name="user" class="form-control" maxlength="20" required></td>
                    <td><label for="pass" class="rightText">Password:</label></td>
                     <td><input id="pass" type="password" placeholder="Password Type Here....." name="pass" maxlength="16" class="form-control"required></td>
                </tr>
                <tr><td><label for="name"class="rightText">Name:</label></td>
                    <td><input id="name" type="text" placeholder="Name Type Here....." name="name" class="form-control"  maxlength="20" required></td>
                    <td><label for="dob"class="rightText">Date Of Birth:</label></td>
                     <td><input id="dob" type="date" name="dob" class="form-control" required></td>
                </tr>
                 <tr><td><label for="mobile"class="rightText">Mobile:</label></td>
                     <td><input id="mobile" type="mobile" placeholder="Mobile Type Here....." maxlength="10" name="mobile" class="form-control" required></td>
                    <td><label for="email"class="rightText">Email:</label></td>
                     <td><input id="email" type="email" placeholder="Email Type Here....." name="email" class="form-control"required></td>
                </tr>
                 <tr><td><label for="user"class="rightText">Address:</label></td>
                     <td colspan="3"> <textarea name="address" maxlength="80" class="form-control"></textarea> </td> 
                 </tr>
                 
                 <tr><td colspan="4"><center>
                    <input type="submit"class="btn-primary">
                    <input type="reset" class="btn-danger"></center></td></tr>
<tr><th colspan="4">
        ${msg} </th> </tr>
            </table>
            
            <a href="index.jsp">Login</a>
              
        </form>
    </div>
</div>
<%@include file="footer.jsp" %>