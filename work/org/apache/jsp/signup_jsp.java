/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2016-08-24 17:00:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/greendarkgreen.css\">\r\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/admincirclebutton.css\"/>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validform(){\r\n");
      out.write("var fn=document.myForm.fname.value;\r\n");
      out.write("var ln=document.myForm.lname.value;\r\n");
      out.write("var pn=document.myForm.phno.value;\r\n");
      out.write("var ad=document.myForm.address.value;\r\n");
      out.write("var gd=document.myForm.gender.value;\r\n");
      out.write("var id=document.myForm.acid.value;\r\n");
      out.write("var psw=document.myForm.password.value;\r\n");
      out.write("var cpsw=document.myForm.rpassword.value;\r\n");
      out.write("if(fn==null || fn==\"\" || fn.trim().length<1){\r\n");
      out.write("\talert(\"First name should not be blank!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(ln==null || ln==\"\" || ln.trim().length<1){\r\n");
      out.write("\talert(\"Last Name should not be blank!!!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(pn==\"\"){\r\n");
      out.write("\talert(\"Phno should have numeric value\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if((pn.length)<8)\r\n");
      out.write(" {\r\n");
      out.write("\t alert(\"Phone number should have at least 8 number\");\r\n");
      out.write("\t return false;\r\n");
      out.write(" }\r\n");
      out.write("else if(pn.charAt(0)!='0')\r\n");
      out.write(" {\r\n");
      out.write(" alert(\"Phone number should start with 0\");\r\n");
      out.write(" return false;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("else if(ad==null || ad==\"\" || ad.trim().length<1){\r\n");
      out.write("\talert(\"Address should not be blank!!!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(gd==null || gd==\"\"){\r\n");
      out.write("\talert(\"Gender should be male or female!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(id==null || id==\"\" || id.trim().length<1){\r\n");
      out.write("\talert(\"Account Id should not be blank!!!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(psw==null || psw==\"\" || psw.length<=6){\r\n");
      out.write("\talert(\"Password must be at least 6 characters!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("else if(cpsw==null || cpsw==\"\" || cpsw.lenght<=6){\r\n");
      out.write("\talert(\"Confirm password must be at least 6 characters!\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body background=\"images/bg2.JPG\" width=\"1000\" height=\"1000\">\r\n");
      out.write("<form action=\"signup\" mehtod=\"post\" name=\"myForm\" onsubmit=\"return validform()\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"form\">\r\n");
      out.write("      \r\n");
      out.write("      <ul class=\"tab-group\">\r\n");
      out.write("        <li class=\"tab active\"><a href=\"#signup\"></a></li>\r\n");
      out.write("        <li class=\"tab\"><a href=\"#login\"></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"tab-content\">\r\n");
      out.write("        <div id=\"signup\">   \r\n");
      out.write("          <h1>Sign Up for Free</h1>\r\n");
      out.write("          \r\n");
      out.write("          <form action=\"/\" method=\"post\">\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"top-row\">\r\n");
      out.write("            <div class=\"field-wrap\">\r\n");
      out.write("              <label>\r\n");
      out.write("                <span class=\"req\"></span>\r\n");
      out.write("              </label>\r\n");
      out.write("              <input type=\"text\" placeholder=\"Your Account Name\" name=\"acid\" required autocomplete=\"off\" />\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"field-wrap\">\r\n");
      out.write("              <label>\r\n");
      out.write("               <span class=\"req\"></span>\r\n");
      out.write("              </label>\r\n");
      out.write("              <input type=\"text\" placeholder=\"First Name\" name=\"fname\" required autocomplete=\"off\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"field-wrap\">\r\n");
      out.write("            <label>\r\n");
      out.write("              <span class=\"req\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Last Name\" name=\"lname\" required autocomplete=\"off\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <div class=\"field-wrap\">\r\n");
      out.write("            <label>\r\n");
      out.write("             <span class=\"req\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Set A Password\" name=\"password\" required autocomplete=\"off\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("              <div class=\"field-wrap\">\r\n");
      out.write("            <label>\r\n");
      out.write("              <span class=\"req\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Re-Type Password\" name=\"rpassword\" required autocomplete=\"off\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("           <div class=\"field-wrap\">\r\n");
      out.write("            <label>\r\n");
      out.write("              <span class=\"req\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Ph-No.(09xxxxxxx)\" name=\"phno\" required autocomplete=\"off\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"field-wrap\">\r\n");
      out.write("            <label>\r\n");
      out.write("              <span class=\"req\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Address\" name=\"address\" required autocomplete=\"off\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        <div class=\"field-wrap\">\r\n");
      out.write("            <label>\r\n");
      out.write("              <span class=\"req\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            Gender\r\n");
      out.write("            <select name=\"gender\">\r\n");
      out.write("           <option value=\"male\">Male</option> \r\n");
      out.write("             <option value=\"female\">Female</option>  \r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("          <button type=\"submit\" class=\"button button-block\"/>Create Account</button>\r\n");
      out.write("          \r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"login\">   \r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("          <form action=\"/\" method=\"post\">\r\n");
      out.write("          \r\n");
      out.write("     \r\n");
      out.write("          \r\n");
      out.write("          </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("      </div><!-- tab-content -->\r\n");
      out.write("      \r\n");
      out.write("</div> <!-- /form -->\r\n");
      out.write("</body>\r\n");
      out.write(" \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}