package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jstl_002dparseDate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fm_formatDate_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fm_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fm_formatDate_value_type_nobody.release();
    _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("date");
      _jspx_th_c_set_0.setValue( new java.util.Date());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("        \n");
      out.write("        <p>Curr Date:\n");
      out.write("            ");
      if (_jspx_meth_fm_formatDate_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p>Curr Time:\n");
      out.write("        ");
      if (_jspx_meth_fm_formatDate_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p>Curr Date & Time:\n");
      out.write("            ");
      if (_jspx_meth_fm_formatDate_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <p>Curr Date short:\n");
      out.write("            ");
      if (_jspx_meth_fm_formatDate_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p>Curr Time short:\n");
      out.write("        ");
      if (_jspx_meth_fm_formatDate_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p>Curr Date & Time short:\n");
      out.write("            ");
      if (_jspx_meth_fm_formatDate_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
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

  private boolean _jspx_meth_fm_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fm:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fm_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fm_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fm_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fm_formatDate_0.setParent(null);
    _jspx_th_fm_formatDate_0.setType("date");
    _jspx_th_fm_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fm_formatDate_0 = _jspx_th_fm_formatDate_0.doStartTag();
    if (_jspx_th_fm_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fm_formatDate_value_type_nobody.reuse(_jspx_th_fm_formatDate_0);
      return true;
    }
    _jspx_tagPool_fm_formatDate_value_type_nobody.reuse(_jspx_th_fm_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fm_formatDate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fm:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fm_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fm_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fm_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fm_formatDate_1.setParent(null);
    _jspx_th_fm_formatDate_1.setType("time");
    _jspx_th_fm_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fm_formatDate_1 = _jspx_th_fm_formatDate_1.doStartTag();
    if (_jspx_th_fm_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fm_formatDate_value_type_nobody.reuse(_jspx_th_fm_formatDate_1);
      return true;
    }
    _jspx_tagPool_fm_formatDate_value_type_nobody.reuse(_jspx_th_fm_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_fm_formatDate_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fm:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fm_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fm_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fm_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fm_formatDate_2.setParent(null);
    _jspx_th_fm_formatDate_2.setType("both");
    _jspx_th_fm_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fm_formatDate_2 = _jspx_th_fm_formatDate_2.doStartTag();
    if (_jspx_th_fm_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fm_formatDate_value_type_nobody.reuse(_jspx_th_fm_formatDate_2);
      return true;
    }
    _jspx_tagPool_fm_formatDate_value_type_nobody.reuse(_jspx_th_fm_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_fm_formatDate_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fm:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fm_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fm_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fm_formatDate_3.setParent(null);
    _jspx_th_fm_formatDate_3.setType("date");
    _jspx_th_fm_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fm_formatDate_3.setTimeStyle("long");
    int _jspx_eval_fm_formatDate_3 = _jspx_th_fm_formatDate_3.doStartTag();
    if (_jspx_th_fm_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.reuse(_jspx_th_fm_formatDate_3);
      return true;
    }
    _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.reuse(_jspx_th_fm_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_fm_formatDate_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fm:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fm_formatDate_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fm_formatDate_4.setPageContext(_jspx_page_context);
    _jspx_th_fm_formatDate_4.setParent(null);
    _jspx_th_fm_formatDate_4.setType("time");
    _jspx_th_fm_formatDate_4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fm_formatDate_4.setTimeStyle("long");
    int _jspx_eval_fm_formatDate_4 = _jspx_th_fm_formatDate_4.doStartTag();
    if (_jspx_th_fm_formatDate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.reuse(_jspx_th_fm_formatDate_4);
      return true;
    }
    _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.reuse(_jspx_th_fm_formatDate_4);
    return false;
  }

  private boolean _jspx_meth_fm_formatDate_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fm:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fm_formatDate_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fm_formatDate_5.setPageContext(_jspx_page_context);
    _jspx_th_fm_formatDate_5.setParent(null);
    _jspx_th_fm_formatDate_5.setType("both");
    _jspx_th_fm_formatDate_5.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fm_formatDate_5.setTimeStyle("long");
    int _jspx_eval_fm_formatDate_5 = _jspx_th_fm_formatDate_5.doStartTag();
    if (_jspx_th_fm_formatDate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.reuse(_jspx_th_fm_formatDate_5);
      return true;
    }
    _jspx_tagPool_fm_formatDate_value_type_timeStyle_nobody.reuse(_jspx_th_fm_formatDate_5);
    return false;
  }
}
