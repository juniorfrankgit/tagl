package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"\">\r\n");
      out.write("        <title>Welcome</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"student.js\"></script>\r\n");
      out.write("        <h1 style=\"text-align:center\">This app uses Redis services to store and load data from server</h1>\r\n");
      out.write("        <h2 style=\"text-align:center\">Student informations</h2>\r\n");
      out.write("\r\n");
      out.write("        <form  style=\"text-align:center\" method=\"POST\" action=\"MainServlet\">\r\n");
      out.write("        \t<label>Name </label><input type=\"text\"/><br/>\r\n");
      out.write("        \t<label>Firstname </label><input type=\"text\"/><br/>\r\n");
      out.write("        \t<label>Age </label><input type=\"text\"/><br/>\r\n");
      out.write("        \t<label>Student number </label><input type=\"text\"/><br/>\r\n");
      out.write("        \t<label>Courses</label>\r\n");
      out.write("        \t<input type=\"checkbox\" name=\"tagl\" value=\"tagl\">TAGL<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"cse\" value=\"cse\">CSE<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"slpc\" value=\"slpc\">SLPC<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"ro\" value=\"ro\">RO<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"tli\" value=\"tli\">TLI<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"arc\" value=\"arc\">ARC<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"atd\" value=\"atd\">ATD<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"alr\" value=\"alr\">ALR<br>\r\n");
      out.write("    \t\t\t<label>Hobbies </label>\r\n");
      out.write("        \t<input type=\"checkbox\" name=\"soccer\" value=\"soccer\">SOOCER<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"basket\" value=\"basket\">BASKET<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"running\" value=\"running\">RUNNING<br>\r\n");
      out.write("    \t\t\t<input type=\"checkbox\" name=\"music\" value=\"music\">MUSIC<br>\r\n");
      out.write("    \t\t\t<input type=\"submit\" value=\"SEND\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
