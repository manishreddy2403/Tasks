var div1 = document.createElement("div");
div1.className = "div1-edit";
document.getElementById("div-id").appendChild(div1);
var val = true;


function clickit(bol) {




    if (bol === 1 && val) {



        var table = document.createElement("table");
        table.className = "table-edit"
        div1.appendChild(table)



        var tr0 = document.createElement("tr");
        tr0.className = "tr0-edit"

        var th = document.createElement("th")
        th.innerHTML = "id";
        tr0.appendChild(th);

        var th1 = document.createElement("th")
        th1.innerHTML = "First_name";
        tr0.appendChild(th1);

        var th2 = document.createElement("th")
        th2.innerHTML = "Last_name";
        tr0.appendChild(th2);

        var th3 = document.createElement("th")
        th3.innerHTML = "Email";
        tr0.appendChild(th3);

        var th4 = document.createElement("th")
        th4.innerHTML = "pic";
        tr0.appendChild(th4);

        var th5 = document.createElement("th")
        th5.innerHTML = "Edit_data";
        tr0.appendChild(th5);
        table.appendChild(tr0)






        const xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            const values = JSON.parse(this.response);
            const data = values.data;
            for (let index = 0; index < data.length; index++) {

                let tr = document.createElement("tr");
                tr.setAttribute("id", index + 1);

                let td0 = document.createElement("td");
                td0.setAttribute('id', 'td0' + tr.id);
                td0.innerHTML = data[index].id;
                tr.appendChild(td0);


                let td1 = document.createElement("td");
                td1.setAttribute('id', 'td1' + tr.id)
                td1.innerHTML = data[index].first_name;
                tr.appendChild(td1);


                let td2 = document.createElement("td");
                td2.setAttribute('id', 'td2' + tr.id)
                td2.innerHTML = data[index].last_name;
                tr.appendChild(td2);

                let td3 = document.createElement("td");
                td3.setAttribute('id', 'td3' + tr.id)
                td3.innerHTML = data[index].email;
                tr.appendChild(td3);

                let td4 = document.createElement("td");
                td4.setAttribute('id', 'td4' + tr.id)
                td4.innerHTML = data[index].avatar;
                tr.appendChild(td4);

                let td5 = document.createElement("td");
                let button1 = document.createElement("button");
                
                button1.className = "button1-edit";
                button1.innerHTML = "Edit";
                button1.addEventListener('click', function () {
                    //var a = JSON.stringify(index+1);
                    console.log(tr.id);

                    var id =document.getElementById("td0"+tr.id);
                    var first_name =document.getElementById("td1"+tr.id);
                    var last_name =document.getElementById("td2"+tr.id);
                    var email =document.getElementById("td3"+tr.id);
                    var pic =document.getElementById("td4"+tr.id);

                    var id_data=id.innerHTML;
                    var first_name_data=first_name.innerHTML;
                    var last_name_data=last_name.innerHTML;
                    var email_data=email.innerHTML;
                    var pic_data=pic.innerHTML;

                    id.innerHTML="<input type='text' id=' next_text"+tr.id+"'value='"+id_data+"'>";
                    first_name.innerHTML="<input type='text' id=' next_text"+tr.id+"'value='"+first_name_data+"'>";
                    last_name.innerHTML="<input type='text' id=' next_text"+tr.id+"'value='"+last_name_data+"'>";
                    email.innerHTML="<input type='text' id=' next_text"+tr.id+"'value='"+email_data+"'>";
                    pic .innerHTML="<input type='text' id=' next_text"+tr.id+"'value='"+pic_data+"'>";




                });
               
                var button2=document.createElement("button")
                button2.innerHTML="save";
                button2.id=""
                td5.appendChild(button2)
                
               
                
                td5.appendChild(button1);

                tr.appendChild(td5)


                table.appendChild(tr);



                // let element = data[index];

                // console.log(element);



            }
        }
        xhttp.open("GET", "https://reqres.in/api/users?page=1");
        xhttp.send();
    }


    val = false;

}