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
package org.apache.sling.scripting.sightly.apps.pranathisites.components.slingmodelsexample;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class slingmodelsexample__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_template = null;
Object _global_slingexmodel = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_haslabel = null;
Collection var_collectionvar3_list_coerced$ = null;
Object _global_label = null;
Object _global_linkpath = null;
Object _global_external = null;
Object _global_target = null;
Collection var_collectionvar17_list_coerced$ = null;
Collection var_collectionvar27_list_coerced$ = null;
Collection var_collectionvar38_list_coerced$ = null;
Collection var_collectionvar49_list_coerced$ = null;
Collection var_collectionvar60_list_coerced$ = null;
Object _dynamic_text = bindings.get("text");
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_slingexmodel = renderContext.call("use", com.adobe.aem.pranathi.core.models.SlingModelExampleModel.class.getName(), obj());
_global_haslabel = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "mainLabel");
if (renderContext.getObjectModel().toBoolean(_global_haslabel)) {
    out.write("\r\n\r\n  <p>");
    {
        String var_0 = ("Main Label: " + renderContext.getObjectModel().toString(renderContext.call("xss", _global_haslabel, "text")));
        out.write(renderContext.getObjectModel().toString(var_0));
    }
    out.write("</p>\r\n  ");
    {
        Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_slingexmodel, "resourceType");
        if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
            out.write("<p>");
            {
                String var_2 = ("Resource Type: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_slingexmodel, "resourceType"), "text")));
                out.write(renderContext.getObjectModel().toString(var_2));
            }
            out.write("</p>");
        }
    }
    out.write("\r\n\r\n  <h2>'data-sly-list' Example</h2>\r\n  ");
    {
        Object var_collectionvar3 = renderContext.getObjectModel().resolveProperty(_global_slingexmodel, "links");
        {
            long var_size4 = ((var_collectionvar3_list_coerced$ == null ? (var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3)) : var_collectionvar3_list_coerced$).size());
            {
                boolean var_notempty5 = (var_size4 > 0);
                if (var_notempty5) {
                    {
                        long var_end8 = var_size4;
                        {
                            boolean var_validstartstepend9 = (((0 < var_size4) && true) && (var_end8 > 0));
                            if (var_validstartstepend9) {
                                out.write("<ul>");
                                if (var_collectionvar3_list_coerced$ == null) {
                                    var_collectionvar3_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar3);
                                }
                                long var_index10 = 0;
                                for (Object linklist : var_collectionvar3_list_coerced$) {
                                    {
                                        boolean var_traversal12 = (((var_index10 >= 0) && (var_index10 <= var_end8)) && true);
                                        if (var_traversal12) {
                                            out.write("\r\n      <li>\r\n        ");
_global_label = renderContext.getObjectModel().resolveProperty(linklist, "label");
                                            if (renderContext.getObjectModel().toBoolean(_global_label)) {
                                                out.write("<p>");
                                                {
                                                    Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(linklist, "label"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_13));
                                                }
                                                out.write("</p>");
                                            }
                                            out.write("\r\n        ");
_global_linkpath = renderContext.getObjectModel().resolveProperty(linklist, "linkPath");
                                            if (renderContext.getObjectModel().toBoolean(_global_linkpath)) {
                                                out.write("<p>");
                                                {
                                                    Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(linklist, "linkPath"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_14));
                                                }
                                                out.write("</p>");
                                            }
                                            out.write("\r\n        ");
_global_external = renderContext.getObjectModel().resolveProperty(linklist, "external");
                                            if (renderContext.getObjectModel().toBoolean(_global_external)) {
                                                out.write("<p>");
                                                {
                                                    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(linklist, "external"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_15));
                                                }
                                                out.write("</p>");
                                            }
                                            out.write("\r\n        ");
_global_target = renderContext.getObjectModel().resolveProperty(linklist, "target");
                                            if (renderContext.getObjectModel().toBoolean(_global_target)) {
                                                out.write("<p>");
                                                {
                                                    Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(linklist, "target"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_16));
                                                }
                                                out.write("</p>");
                                            }
                                            out.write("\r\n      </li>\r\n  ");
                                        }
                                    }
                                    var_index10++;
                                }
                                out.write("</ul>");
                            }
                        }
                    }
                }
            }
        }
        var_collectionvar3_list_coerced$ = null;
    }
    out.write("\r\n\r\n  <h2>'data-sly-repeat' Example</h2>\r\n  ");
    {
        Object var_collectionvar17 = renderContext.getObjectModel().resolveProperty(_global_slingexmodel, "links");
        {
            long var_size18 = ((var_collectionvar17_list_coerced$ == null ? (var_collectionvar17_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar17)) : var_collectionvar17_list_coerced$).size());
            {
                boolean var_notempty19 = (var_size18 > 0);
                if (var_notempty19) {
                    {
                        long var_end22 = var_size18;
                        {
                            boolean var_validstartstepend23 = (((0 < var_size18) && true) && (var_end22 > 0));
                            if (var_validstartstepend23) {
                                if (var_collectionvar17_list_coerced$ == null) {
                                    var_collectionvar17_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar17);
                                }
                                long var_index24 = 0;
                                for (Object linklistrepeat : var_collectionvar17_list_coerced$) {
                                    {
                                        boolean var_traversal26 = (((var_index24 >= 0) && (var_index24 <= var_end22)) && true);
                                        if (var_traversal26) {
                                            out.write("<ul>\r\n    <li>\r\n      ");
                                            {
                                                Object var_collectionvar27 = renderContext.getObjectModel().resolveProperty(linklistrepeat, "label");
                                                {
                                                    long var_size28 = ((var_collectionvar27_list_coerced$ == null ? (var_collectionvar27_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar27)) : var_collectionvar27_list_coerced$).size());
                                                    {
                                                        boolean var_notempty29 = (var_size28 > 0);
                                                        if (var_notempty29) {
                                                            {
                                                                long var_end32 = var_size28;
                                                                {
                                                                    boolean var_validstartstepend33 = (((0 < var_size28) && true) && (var_end32 > 0));
                                                                    if (var_validstartstepend33) {
                                                                        if (var_collectionvar27_list_coerced$ == null) {
                                                                            var_collectionvar27_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar27);
                                                                        }
                                                                        long var_index34 = 0;
                                                                        for (Object labelr : var_collectionvar27_list_coerced$) {
                                                                            {
                                                                                boolean var_traversal36 = (((var_index34 >= 0) && (var_index34 <= var_end32)) && true);
                                                                                if (var_traversal36) {
                                                                                    out.write("<p>");
                                                                                    {
                                                                                        Object var_37 = renderContext.call("xss", labelr, "text");
                                                                                        out.write(renderContext.getObjectModel().toString(var_37));
                                                                                    }
                                                                                    out.write("</p>\n");
                                                                                }
                                                                            }
                                                                            var_index34++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var_collectionvar27_list_coerced$ = null;
                                            }
                                            out.write("\r\n      ");
                                            {
                                                Object var_collectionvar38 = renderContext.getObjectModel().resolveProperty(linklistrepeat, "linkPath");
                                                {
                                                    long var_size39 = ((var_collectionvar38_list_coerced$ == null ? (var_collectionvar38_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar38)) : var_collectionvar38_list_coerced$).size());
                                                    {
                                                        boolean var_notempty40 = (var_size39 > 0);
                                                        if (var_notempty40) {
                                                            {
                                                                long var_end43 = var_size39;
                                                                {
                                                                    boolean var_validstartstepend44 = (((0 < var_size39) && true) && (var_end43 > 0));
                                                                    if (var_validstartstepend44) {
                                                                        if (var_collectionvar38_list_coerced$ == null) {
                                                                            var_collectionvar38_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar38);
                                                                        }
                                                                        long var_index45 = 0;
                                                                        for (Object linkpathr : var_collectionvar38_list_coerced$) {
                                                                            {
                                                                                boolean var_traversal47 = (((var_index45 >= 0) && (var_index45 <= var_end43)) && true);
                                                                                if (var_traversal47) {
                                                                                    out.write("<p>");
                                                                                    {
                                                                                        Object var_48 = renderContext.call("xss", linkpathr, "text");
                                                                                        out.write(renderContext.getObjectModel().toString(var_48));
                                                                                    }
                                                                                    out.write("</p>\n");
                                                                                }
                                                                            }
                                                                            var_index45++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var_collectionvar38_list_coerced$ = null;
                                            }
                                            out.write("\r\n      ");
                                            {
                                                Object var_collectionvar49 = renderContext.getObjectModel().resolveProperty(linklistrepeat, "external");
                                                {
                                                    long var_size50 = ((var_collectionvar49_list_coerced$ == null ? (var_collectionvar49_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar49)) : var_collectionvar49_list_coerced$).size());
                                                    {
                                                        boolean var_notempty51 = (var_size50 > 0);
                                                        if (var_notempty51) {
                                                            {
                                                                long var_end54 = var_size50;
                                                                {
                                                                    boolean var_validstartstepend55 = (((0 < var_size50) && true) && (var_end54 > 0));
                                                                    if (var_validstartstepend55) {
                                                                        if (var_collectionvar49_list_coerced$ == null) {
                                                                            var_collectionvar49_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar49);
                                                                        }
                                                                        long var_index56 = 0;
                                                                        for (Object externalr : var_collectionvar49_list_coerced$) {
                                                                            {
                                                                                boolean var_traversal58 = (((var_index56 >= 0) && (var_index56 <= var_end54)) && true);
                                                                                if (var_traversal58) {
                                                                                    out.write("<p>");
                                                                                    {
                                                                                        Object var_59 = renderContext.call("xss", externalr, "text");
                                                                                        out.write(renderContext.getObjectModel().toString(var_59));
                                                                                    }
                                                                                    out.write("</p>\n");
                                                                                }
                                                                            }
                                                                            var_index56++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var_collectionvar49_list_coerced$ = null;
                                            }
                                            out.write("\r\n      ");
                                            {
                                                Object var_collectionvar60 = renderContext.getObjectModel().resolveProperty(linklistrepeat, "target");
                                                {
                                                    long var_size61 = ((var_collectionvar60_list_coerced$ == null ? (var_collectionvar60_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar60)) : var_collectionvar60_list_coerced$).size());
                                                    {
                                                        boolean var_notempty62 = (var_size61 > 0);
                                                        if (var_notempty62) {
                                                            {
                                                                long var_end65 = var_size61;
                                                                {
                                                                    boolean var_validstartstepend66 = (((0 < var_size61) && true) && (var_end65 > 0));
                                                                    if (var_validstartstepend66) {
                                                                        if (var_collectionvar60_list_coerced$ == null) {
                                                                            var_collectionvar60_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar60);
                                                                        }
                                                                        long var_index67 = 0;
                                                                        for (Object targetr : var_collectionvar60_list_coerced$) {
                                                                            {
                                                                                boolean var_traversal69 = (((var_index67 >= 0) && (var_index67 <= var_end65)) && true);
                                                                                if (var_traversal69) {
                                                                                    out.write("<p>");
                                                                                    {
                                                                                        Object var_70 = renderContext.call("xss", targetr, "text");
                                                                                        out.write(renderContext.getObjectModel().toString(var_70));
                                                                                    }
                                                                                    out.write("</p>\n");
                                                                                }
                                                                            }
                                                                            var_index67++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var_collectionvar60_list_coerced$ = null;
                                            }
                                            out.write("\r\n    </li>\r\n</ul>\n");
                                        }
                                    }
                                    var_index24++;
                                }
                            }
                        }
                    }
                }
            }
        }
        var_collectionvar17_list_coerced$ = null;
    }
    out.write("\r\n\r\n");
}
out.write("\r\n");
{
    Object var_templatevar71 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions72_field$_isempty = (!renderContext.getObjectModel().toBoolean(_dynamic_text));
        {
            String var_templateoptions72_field$_classappend = "cmp-title";
            {
                java.util.Map var_templateoptions72 = obj().with("isEmpty", var_templateoptions72_field$_isempty).with("classAppend", var_templateoptions72_field$_classappend);
                callUnit(out, renderContext, var_templatevar71, var_templateoptions72);
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

