package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carousel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- indicadores -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"7\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"8\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- imagenes que se pasan-->\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"img/img1.jpg\" alt=\"Chania\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Chania</h3>\n");
      out.write("                            <p>The atmosphere in Chania has a touch of Florence and Venice.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img2.jpg\" alt=\"Chania\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Chania</h3>\n");
      out.write("                            <p>The atmosphere in Chania has a touch of Florence and Venice.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img3.jpg\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img4.jpg\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img5.jpg\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img6.png\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img7.jpg\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img8.jpg\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"img/img9.jpg\" alt=\"Flower\" width=\"150\" height=\"150\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h3>Flowers</h3>\n");
      out.write("                            <p>Beautiful flowers in Kolymbari, Crete.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- controles siguiente y anterior -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>");
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
