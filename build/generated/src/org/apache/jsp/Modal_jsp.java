package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import coneccion.conecta;
import java.sql.*;

public final class Modal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">INFORMACION COMPLETA</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <h1>hola</h1>\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <table class=\"table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>&nbsp\n");
      out.write("                        <th>Nombre</th>&nbsp\n");
      out.write("                        <th>Genero</th>&nbsp\n");
      out.write("                        <th>Duracion</th>&nbsp\n");
      out.write("                        <th>Calificacion</th>&nbsp\n");
      out.write("                        <th>Disponibilidad</th>&nbsp\n");
      out.write("                        <th>Estado</th>&nbsp\n");
      out.write("                        <th>Ejemplares</th>&nbsp\n");
      out.write("                        <th>Emplado que registra</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>   \n");
      out.write("                    ");

                        try {
                        ResultSet rs = (ResultSet) request.getAttribute("lista");
                        while (rs.next()) {
                    
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rs.getString(1) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(6) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(7) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(8) );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(9) );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");

                        }
}catch(Exception e){
e.printStackTrace();
}
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>                      \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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
