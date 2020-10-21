apiclient = (function () {
    let url = "https://hidden-coast-13323.herokuapp.com/v1/";
    return {
        getCasesByCity: function (city, callback) {
            $.getJSON(url + "?place=" + city, (data) => {
                callback(data);
            }, null)
        },
    }
})();
