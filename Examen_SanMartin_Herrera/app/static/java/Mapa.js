function iniciarMap(){
    var coord = {lat:-33.457500, lng: -70.664994};
    var map = new google.maps.Map(document.getElementById("map"),{
        zoom: 10,
        center: coord
    })
    var marker = new google.maps.Marker({
        position: coord,
        map: map
    });
 }