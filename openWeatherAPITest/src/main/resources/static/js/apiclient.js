apiclient = (function () {

    return {
		getCityByName : function (cityName, callback) {
			$.getJSON("http://localhost:8080/wather/" + cityName,function (data) {
					callback(null, data);
				}
			);
		},
    }

})();