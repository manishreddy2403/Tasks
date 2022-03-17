
function clickit1(){
    event.preventDefault();
const fid = document.getElementById("f-id").value;
const lid = document.getElementById("l-id").value;
const cid = document.getElementById("c-id").value;
const pid = document.getElementById("p-id").value;





 const  data =
 {
    firstname:fid,
    lastname:lid,
    city:cid,
    picurl:pid,
}

console.log(fid ,  lid );
console.log(cid ,  pid );

fetch('http://corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee', {
  method: "POST",
  body: JSON.stringify(data),
  headers: { 'Accept':'application/json',  
  "Access-Control-Allow-Origin":"*",
  "Access-Control-Allow-Methods":"*",
  "Content-type": "application/json;" }
}).then(res=>{
    res.json()
}).then(data=>{
    console.log(data);
})

}




 
function clickit() {
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
    const values  = JSON.parse(this.responseText);
       const data = values.content;
for (let index = 0; index < data.length; index++) {
    var p=document.createElement("p");
document.body.appendChild(p);
p.innerHTML=data[index].firstname;

// let element = data[index];

//     console.log(element);

 
}
    

         }
    xhttp.open("GET", "http://corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee","TRUE");
    xhttp.send();
}