/**
 * httpRequest 통신 스크립트
 * 2015.10.08 이원희
 */
var httpRequest = null;
function getHttpRequest() {
	if(window.ActiveXObject) {
		return new ActiveXObject("Msxml2XMLHTTP");
	} else if(window.XMLHttpRequest) {
		return new XMLHttpRequest();
	} else {
		return null;
	}
}

function sendRequest(url, params, callback, method) {
	httpRequest = getHttpRequest();
	var httpMethod = method ? method : 'GET';
	if(httpMethod != 'GET' && httpMethod != 'POST') {
		httpMethod = 'GET';
	}
	
	var httpParams = (params == null || param == '') ? null : params;
	var httpUrl = url;
	if(httpMethod == 'GET' && httpParams != null) {
		httpUrl = httpUrl + '?' + httpParams;
	}
	httpRequest.open(httpMethod, httpUrl, true);
	httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	httpRequest.onreadystatechange = callback;
	httpRequest.send(httpMethod == 'POST' ? httpParams : null);
}