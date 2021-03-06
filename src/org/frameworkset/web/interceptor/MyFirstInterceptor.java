/**
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.  
 */
package org.frameworkset.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.frameworkset.web.servlet.handler.HandlerMeta;



/**
 * <p>
 * FirstInterceptor.java
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * bboss workgroup
 * </p>
 * <p>
 * Copyright (c) 2009
 * </p>
 * 
 * @Date 2011-5-31
 * @author biaoping.yin
 * @version 1.0
 */
public  class MyFirstInterceptor extends AuthenticateInterceptor{

	@Override
	protected boolean check(HttpServletRequest request,
			HttpServletResponse response, HandlerMeta handlerMeta)
	{
		String name = request.getParameter("name");
		if(name != null && name.equals("test"))
			return false;
		return true;
	}

	@Override
	protected boolean checkPermission(HttpServletRequest request,
			HttpServletResponse response, HandlerMeta handlerMeta, String uri) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
