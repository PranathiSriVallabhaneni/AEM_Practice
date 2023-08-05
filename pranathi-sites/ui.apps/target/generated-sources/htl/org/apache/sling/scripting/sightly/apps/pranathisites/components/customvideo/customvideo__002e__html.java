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
package org.apache.sling.scripting.sightly.apps.pranathisites.components.customvideo;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customvideo__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_template = null;
Object _global_model = null;
Object _global_hascontent = null;
Object _dynamic_clientlib = bindings.get("clientlib");
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_model = renderContext.call("use", com.adobe.aem.pranathi.core.models.ServiceDemoModel.class.getName(), obj());
_global_hascontent = renderContext.getObjectModel().resolveProperty(_global_model, "myTitle");
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("\r\n  <h2>");
    {
        Object var_0 = renderContext.call("xss", _global_hascontent, "text");
        out.write(renderContext.getObjectModel().toString(var_0));
    }
    out.write("</h2>\r\n\r\n");
}
out.write("\r\n");
{
    Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_dynamic_clientlib, "css");
    {
        String var_templateoptions2_field$_categories = "myCategory";
        {
            java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
            callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
        }
    }
}
out.write("\r\n");
{
    Object var_templatevar3 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions4_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            String var_templateoptions4_field$_classappend = "cmp-title";
            {
                java.util.Map var_templateoptions4 = obj().with("isEmpty", var_templateoptions4_field$_isempty).with("classAppend", var_templateoptions4_field$_classappend);
                callUnit(out, renderContext, var_templatevar3, var_templateoptions4);
            }
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

