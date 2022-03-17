
let obj =[{},{ name:'so',status:'true'},{ name:'breakfast',status:'pending'},{ name:'somithg',status:'pending'}];

var  div=document.createElement("div");
  div.setAttribute("id","box");
  div.className="div-edit";
  document.body.appendChild(div);


var p=document.createElement("p");
p.innerHTML="List of task to do:";
p.id="p";
document.getElementById("box").appendChild(p);

var span=document.createElement("span");
span.id="span-id";
p.appendChild(span);
span.innerHTML=obj.length;



var textbox=document.createElement('input');
textbox.placeholder="enter items..";
textbox.className="input-edit";
textbox.id="input-id";
document.getElementById("box").appendChild(textbox);

var button=document.createElement("button");
button.innerHTML="Add activity";
button.className="buttton-edit";
button.addEventListener("click",clk);
document.getElementById("box").appendChild(button);





var unorderli=document.createElement("ul");
unorderli.className="ul-edit";
unorderli.id="ul-id";
document.getElementById("box").appendChild(unorderli);

;







// adding functionality 


function clk(){
  var x =document.getElementById("input-id").value;
  textbox.value="";
  obj.push({name:x,status:'pending'});
  var url =document.getElementById("ul-id"); 
  var list = document.createElement('li');
  list.innerHTML= list.name= x;
  var checkbox=document.createElement("input");
  checkbox.type="checkbox";
  checkbox.addEventListener('click',changeClass);
  list.appendChild(checkbox);
  unorderli.appendChild(list);
  console.log(list)
  
}
function createList() {
  var url= document.getElementById('ul-id');
  for (var i=0; i <= obj.length - 1; i++) {
      if (obj[i].activity === 'breakfast') {
          obj[i].status = 'done';
      }
      var list = document.createElement('li');
      list.innerHTML = list.name = obj[i].activity;
      var checkbox = document.createElement('input');
      checkbox.type = 'checkbox';
      checkbox.addEventListener('click', changeClass);
      list.appendChild(checkbox);

      if (obj[i].status === 'done') {
          checkbox.checked = true;
          checkbox.parentElement.style.color = 'green';
      }
      url.appendChild(list);
  }
};
function changeClass() {
  this.parentElement.style.color = 'blue';
}