apiclient = (function () {
    let url = "http://localhost:8080/v1/";
    return {
        getCasesByCity: function (city, callback) {
            $.getJSON(url + "?place=" + city, (data) => {
                callback(data);
            }, null)
        },

    }

})();
