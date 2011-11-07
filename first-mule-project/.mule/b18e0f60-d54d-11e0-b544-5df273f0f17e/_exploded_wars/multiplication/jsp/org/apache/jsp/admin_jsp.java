package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"mule-resource/js/mule.js\"></script> \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("        function rpcCallMuleEcho() { \r\n");
      out.write("            // Create a new object and populate it with the request data\r\n");
      out.write("            var data = new Object();\r\n");
      out.write("            data.phrase = document.getElementById('phrase').value;\r\n");
      out.write("            // Send the data to the mule endpoint and set a callback to handle the response.\r\n");
      out.write("            // The \"mule\" element is provided by the Mule JavaScript client.\r\n");
      out.write("            mule.rpc(\"services/catalog\", data, rpcEchoResponse); \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // Display response message data.\r\n");
      out.write("        function rpcEchoResponse(message) {\r\n");
      out.write("            document.getElementById(\"response\").innerHTML = \"<b>Response:&nbsp;</b>\" + message.data + \"\\n\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body link=\"#FFFFFF\" vlink=\"#FFFFFF\" alink=\"#FFFFFF\" bgcolor=\"#990000\" text=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<form method=\"POST\" name=\"multiplication\" action=\"");
      out.print(request.getContextPath());
      out.write("/services/catalog\">\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>Title: </td>\r\n");
      out.write("            <td><input id =\"phrase\" type=\"text\" name=\"phrase\"/></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <input id=\"sendButton\" class=\"button\" type=\"submit\" name=\"Go\" value=\"*100\" onclick=\"rpcCallMuleEcho();\"/>\r\n");
      out.write("</form>\r\n");
      out.write("<pre id=\"response\"></pre>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
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
