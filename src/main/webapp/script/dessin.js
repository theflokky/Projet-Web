d=document.getElementById("zone_dessin");

function start() {
  d.addEventListener("mousedown", mouseDown);
  d.addEventListener("mouseup", mouseUp);
}

function mouseDown() {
  d.innerHTML = "down";
}

function mouseUp() {
  d.innerHTML = "up";
}
