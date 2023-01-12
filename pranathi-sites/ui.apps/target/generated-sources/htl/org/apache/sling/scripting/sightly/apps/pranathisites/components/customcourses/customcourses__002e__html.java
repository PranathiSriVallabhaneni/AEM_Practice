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
package org.apache.sling.scripting.sightly.apps.pranathisites.components.customcourses;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customcourses__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_template = null;
Object _global_model = null;
Object _global_hascontent = null;
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_model = renderContext.call("use", com.adobe.aem.pranathi.core.models.ServiceDemoModel.class.getName(), obj());
_global_hascontent = renderContext.getObjectModel().resolveProperty(_global_model, "myTitle");
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("\r\n  <h2>");
    {
        Object var_0 = renderContext.call("xss", _global_hascontent, "text");
        out.write(renderContext.getObjectModel().toString(var_0));
    }
    out.write("</h2>\r\n  <h3>");
    {
        String var_1 = ("Course Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "serviceDemo"), "courseName"), "text")));
        out.write(renderContext.getObjectModel().toString(var_1));
    }
    out.write("</h3>\r\n  <h3>");
    {
        String var_2 = ("Course Duration : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "serviceDemo"), "courseDuration"), "text")));
        out.write(renderContext.getObjectModel().toString(var_2));
    }
    out.write("</h3>\r\n  <h3>");
    {
        String var_3 = ("Course Content : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "serviceDemo"), "courseContent"), "text")));
        out.write(renderContext.getObjectModel().toString(var_3));
    }
    out.write("</h3>\r\n");
}
out.write("\r\n");
{
    Object var_templatevar4 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions5_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            String var_templateoptions5_field$_classappend = "cmp-title";
            {
                java.util.Map var_templateoptions5 = obj().with("isEmpty", var_templateoptions5_field$_isempty).with("classAppend", var_templateoptions5_field$_classappend);
                callUnit(out, renderContext, var_templatevar4, var_templateoptions5);
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

