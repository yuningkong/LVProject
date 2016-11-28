package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>BabyApp</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            @import url('http://fonts.googleapis.com/css?family=Oswald');\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #video-background {\n");
      out.write("                position: fixed;\n");
      out.write("                right: 0; \n");
      out.write("                bottom: 0;\n");
      out.write("                min-width: 100%; \n");
      out.write("                min-height: 100%;\n");
      out.write("                width: auto; \n");
      out.write("                height: auto;\n");
      out.write("                z-index: -100;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            article {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                right: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 60%;\n");
      out.write("                width: 100%;\n");
      out.write("                font-size: 36px;\n");
      out.write("                letter-spacing: 3px;\n");
      out.write("                color: #fff;\n");
      out.write("                font-family: Oswald, sans-serif;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            form{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 60%;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <article>\n");
      out.write("            <h1>Video Background Snippet</h1>\n");
      out.write("            <form action=\"login\" method=\"post\">\n");
      out.write("                Username:<input type=\"text\" name=\"username\" required/>\n");
      out.write("                </br>\n");
      out.write("                Password:<input type=\"password\" name=\"password\" required/>\n");
      out.write("                </br>\n");
      out.write("                <input type=\"submit\" value=\"Login\"/>\n");
      out.write("            </form>\n");
      out.write("            <iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/1C0vMQ6xEvM\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("        </article>\n");
      out.write("        <video autoplay=\"\" loop=\"\" class=\"fillWidth fadeIn animated\" poster=\"https://s3-us-west-2.amazonaws.com/coverr/poster/Traffic-blurred2.jpg\" id=\"video-background\">\n");
      out.write("            <source src=\"https://www.youtube.com/embed/1C0vMQ6xEvM\" type=\"video/mp4\">Your browser does not support the video tag. I suggest you upgrade your browser.\n");
      out.write("        </video>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
