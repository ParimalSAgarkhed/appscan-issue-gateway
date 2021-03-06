/**
 * © Copyright HCL Technologies Ltd. 2019. 
 * LICENSE: Apache License, Version 2.0 https://www.apache.org/licenses/LICENSE-2.0
 */
package com.hcl.appscan.issuegateway.appscanprovider.ase;

public interface ASEConstants {
	
	//Header Parameters Constants 
	String  HEADER_ASC_XSRF_TOKEN 	 = "asc_xsrf_token";
	
	//REST API for ASE
	String  ASE_API_APPLICATIONS     = "/api/applications";
	String  ASE_API_APIKEYLOGIN      = "/api/keylogin/apikeylogin";
	String  ASE_API_APPS_COUNT       = "/api/summaries/apps/count";
	String  ASE_API_ISSUE_DETAILS    = "/api/issues/ISSUEID/application/APPID";
	String  ASE_API_ISSUE_UPDATE     = "/api/issues/ISSUEID";
	
}
