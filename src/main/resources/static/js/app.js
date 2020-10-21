let app = (() => {
    let client = apiclient;
    var mapPaises = (funciones) => {
        document.getElementById("cityN").innerText = funciones.name;
        document.getElementById("weather").innerText = funciones.weather.main;
        document.getElementById("wdes").innerText = funciones.weather.description;
        document.getElementById("temp").innerText = funciones.main.temp;
        document.getElementById("flike").innerText = funciones.main.feels_like;
        document.getElementById("high").innerText = funciones.main.temp_max;
        document.getElementById("low").innerText = funciones.main.temp_min;
        document.getElementById("hum").innerText = funciones.main.humidity;
        document.getElementById("wind").innerText = funciones.wind.speed;
        document.getElementById("clouds").innerText = funciones.clouds.all;
        plotMarkers(funciones.coord);
    }
    var initMap = () => {
        map = new google.maps.Map(document.getElementById("map"), {
            zoom: 2,
            center: {lat: 35.717, lng: 139.731},
        });
    }

    function plotMarkers(m) {
        console.log(m)
        markers = [];
        bounds = new google.maps.LatLngBounds();
        console.log(m.latitude, m.longitude);
        var position = new google.maps.LatLng(m.lat, m.lon);
        console.log(position);
        markers.push(
            new google.maps.Marker({
                position: position,
                map: map,
                animation: google.maps.Animation.DROP
            })
        );
        bounds.extend(position);
        map.fitBounds(bounds);
        map.setZoom(4);
    }

    function init() {
        initMap();
    }

    return {
        init: init,
        consultarCiudad(nombre) {
            console.log(nombre)
            client.getCasesByCity(nombre, mapPaises);
        }
    }
})();
