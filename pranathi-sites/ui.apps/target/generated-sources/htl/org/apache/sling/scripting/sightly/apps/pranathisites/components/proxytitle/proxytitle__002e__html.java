/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.pranathisites.components.proxytitle;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class proxytitle__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_title = null;
Object _global_component = null;
Object _global_template = null;
Object _global_text = null;
Object _dynamic_properties = bindings.get("properties");
out.write("\r\n  ");
_global_title = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Title.class.getName(), obj());
_global_component = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Component.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_text = renderContext.getObjectModel().resolveProperty(_global_title, "text");
if (renderContext.getObjectModel().toBoolean(_global_text)) {
    out.write("<div");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "data"), "json");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
            {
                boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
                if (var_shoulddisplayattr3) {
                    out.write(" data-cmp-data-layer");
                    {
                        boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                        if (!var_istrueattr2) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_component, "id");
        {
            Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
            {
                boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                if (var_shoulddisplayattr7) {
                    out.write(" id");
                    {
                        boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                        if (!var_istrueattr6) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(" class=\"cmp-title\">\r\n ");
    {
        Object var_tagvar8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_title, "type"), "elementName");
        if (renderContext.getObjectModel().toBoolean(var_tagvar8)) {
            out.write("<");
            out.write(renderContext.getObjectModel().toString(var_tagvar8));
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar8)) {
            out.write("<h1");
        }
        out.write(" class=\"cmp-title__text\">");
        {
            Object var_unwrapcondition9 = (((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_title, "linkURL"))) ? (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_title, "linkURL"))) : renderContext.getObjectModel().resolveProperty(_global_title, "linkDisabled")));
            if (!renderContext.getObjectModel().toBoolean(var_unwrapcondition9)) {
                out.write("<a class=\"cmp-title__link\"");
                {
                    Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_title, "linkURL");
                    {
                        Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                        {
                            boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                            if (var_shoulddisplayattr13) {
                                out.write(" href");
                                {
                                    boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                                    if (!var_istrueattr12) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "link"), "htmlAttributes"), "aria-label");
                    {
                        Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                        {
                            boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                            if (var_shoulddisplayattr17) {
                                out.write(" aria-label");
                                {
                                    boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                    if (!var_istrueattr16) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_title, "link"), "htmlAttributes"), "title");
                    {
                        Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "attribute");
                        {
                            boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (!((Object)false).equals(var_attrvalue18))));
                            if (var_shoulddisplayattr21) {
                                out.write(" title");
                                {
                                    boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                                    if (!var_istrueattr20) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    boolean var_attrvalue22 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_title, "data")) ? true : false);
                    {
                        Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "attribute");
                        {
                            boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (false != var_attrvalue22)));
                            if (var_shoulddisplayattr25) {
                                out.write(" data-cmp-clickable");
                                {
                                    boolean var_istrueattr24 = (var_attrvalue22 == true);
                                    if (!var_istrueattr24) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(">");
            }
            {
                Object var_26 = renderContext.call("xss", _global_text, "text");
                out.write(renderContext.getObjectModel().toString(var_26));
            }
            if (!renderContext.getObjectModel().toBoolean(var_unwrapcondition9)) {
                out.write("</a>");
            }
        }
        if (renderContext.getObjectModel().toBoolean(var_tagvar8)) {
            out.write("</");
            out.write(renderContext.getObjectModel().toString(var_tagvar8));
            out.write(">");
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar8)) {
            out.write("</h1>");
        }
    }
    out.write("\r\n         ");
    {
        Object var_testvariable27 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "myProxytitle");
        if (renderContext.getObjectModel().toBoolean(var_testvariable27)) {
            out.write("<p>");
            {
                Object var_28 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "myProxytitle"), "text");
                out.write(renderContext.getObjectModel().toString(var_28));
            }
            out.write("</p>");
        }
    }
    out.write("\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar29 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions30_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_text));
        {
            String var_templateoptions30_field$_classappend = "cmp-title";
            {
                java.util.Map var_templateoptions30 = obj().with("isEmpty", var_templateoptions30_field$_isempty).with("classAppend", var_templateoptions30_field$_classappend);
                callUnit(out, renderContext, var_templatevar29, var_templateoptions30);
            }
        }
    }
}
out.write("\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

