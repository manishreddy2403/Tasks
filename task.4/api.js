// fetch("https://reqres.in/api/users?page=1")
// .then((response) =>{
//     if (response.ok){
//         return response.json();

//     } else{
//         throw new Error("network error");
//     }
// })
// .then(data =>{
//     console.log(data);
//     displaydata(data)

// })
// .catch((error)=> console.error("fetch error:",error));


 var p=document.createElement("p");
p.id="demo";
p.innerHTML="Peace"+"<br/>"
document.body.appendChild(p);

var button=document.createElement("button");
button.innerHTML="clickme"
button.onclick=(note);
button.className="button-edit";
p.appendChild(button)

let div1 = document.createElement("div");
    div1.classList="div1-edit";
    document.body.appendChild(div1);


function note() {
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
    let values  = JSON.parse(this.response);
    let data = values.data;
for (let index = 0; index < data.length; index++) {
    let div = document.createElement("div");
    div.classList="div-edit";
    div1.appendChild(div);

    var unl=document.createElement("ul");
    div.appendChild(unl);

    unl.className="unl-edit";
    var list=document.createElement("li");
    
    unl.appendChild(list);
    var image=document.createElement("img")
    image.className="image-edit";
    image.src=data[index].avatar;
    list.appendChild(image)

    var list0=document.createElement("li");
    list0.innerHTML="User Id:"+data[index].id;
    unl.appendChild(list0);

    var list1=document.createElement("li");
     list1.innerHTML="Name:"+data[index].first_name +"  "+ data[index].last_name;
     unl.appendChild(list1);

     var list2=document.createElement("li");
     list2.innerHTML="Email-ID:"+data[index].email;
     unl.appendChild(list2);
  

    let element = data[index];

    console.log(element);

//   displaydata(element)
    
}
         }
    xhttp.open("GET", "https://reqres.in/api/users?page=1");
    xhttp.send();
}
// function displaydata(element){
//     const information =element.data[0];
//     const d=document.getElementById("information");

