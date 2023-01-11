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
package org.apache.sling.scripting.sightly.apps.pranathisites.components.proxyBiline;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class proxyBiline__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_template = null;
Object _global_bilinemodel = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_hasname = null;
out.write("<h2>Bi-Line Component</h2>\r\n");
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_bilinemodel = renderContext.call("use", com.adobe.aem.pranathi.core.models.BilineModel.class.getName(), obj());
_global_hasname = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "name");
if (renderContext.getObjectModel().toBoolean(_global_hasname)) {
    out.write("\r\n    <p>");
    {
        Object var_0 = renderContext.call("xss", _global_hasname, "text");
        out.write(renderContext.getObjectModel().toString(var_0));
    }
    out.write("</p>\r\n    ");
    {
        Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_bilinemodel, "personPicture");
        if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
            out.write("<p>");
            {
                Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bilinemodel, "personPicture"), "text");
                out.write(renderContext.getObjectModel().toString(var_2));
            }
            out.write("</p>");
        }
    }
    out.write("\r\n    ");
    {
        Object var_testvariable3 = renderContext.getObjectModel().resolveProperty(_global_bilinemodel, "jobTitle");
        if (renderContext.getObjectModel().toBoolean(var_testvariable3)) {
            out.write("<p>");
            {
                Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_bilinemodel, "jobTitle"), "text");
                out.write(renderContext.getObjectModel().toString(var_4));
            }
            out.write("</p>");
        }
    }
    out.write("\r\n    <span class=\"cmp-byline__image\">");
    {
        Object var_resourcecontent5 = renderContext.call("includeResource", ".", obj().with("resourceType", "core/wcm/components/image/v2/image"));
        out.write(renderContext.getObjectModel().toString(var_resourcecontent5));
    }
    out.write("</span>\r\n");
}
out.write("\r\n\r\n\r\n<div>Completed</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

