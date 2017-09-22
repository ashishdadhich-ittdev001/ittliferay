package com.itt.employee.service.context;

import com.liferay.portal.service.ServiceContext;

/**
 * @author Ashish Dadhich
 */
public class BaseServiceContext extends ServiceContext {

	public BaseServiceContext() {
	}

	public BaseServiceContext(ServiceContext serviceContext) {
		merge(serviceContext);
	}

	public ServiceContext getServiceContext() {
		ServiceContext serviceContext = new ServiceContext();

		serviceContext.merge(this);

		return serviceContext;
	}

}