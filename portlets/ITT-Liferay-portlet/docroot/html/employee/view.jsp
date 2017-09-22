<%@ include file="../init.jsp" %>
<portlet:actionURL name="employeeSaveAction" var="employeeSaveActionURL" />

<aui:form action="<%= employeeSaveActionURL %>" cssClass="container-fluid-1280" name="fm">
		<aui:fieldset label="Employee Form">
			<aui:input name="firstName" >
				<aui:validator name="required" />
				<aui:validator name="alpha" />
			</aui:input>
			<aui:input name="lastName">
				<aui:validator name="required" />
				<aui:validator name="alpha" />
			</aui:input>
			<aui:input name="email">
				<aui:validator name="required" />
				<aui:validator name="email" />
			</aui:input>
			<aui:input name="position">
				<aui:validator name="required" />
			</aui:input>
			<aui:input name="dateOfJoining" >
				<!-- mm-dd-yyyy -->
				<aui:validator name="required" />
				<aui:validator name="date" />
			</aui:input>
		</aui:fieldset>

	<aui:button-row>
		<aui:button cssClass="btn-lg" name="saveButton" type="submit" />
	</aui:button-row>
</aui:form>