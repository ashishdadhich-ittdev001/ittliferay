package com.itt.employee.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Ashish Dadhich
 * Portlet implementation class EmployeePortlet
 */
public class EmployeePortlet extends MVCPortlet {
 
	@Override
	public void render(RenderRequest arg0, RenderResponse arg1) throws PortletException, IOException {
		_log.info(" Inside render class...");
		super.render(arg0, arg1);
	}
	
	public void employeeSaveAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		_log.info(" Inside Action class...");
	}
	
	private final Log _log = LogFactoryUtil.getLog(EmployeePortlet.class);
}
