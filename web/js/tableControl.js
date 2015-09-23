//function init() {
//    _table = document.getElementById("table");
//    _table.border = "1px";
//    _table.width = "800px";
//
//    for (var i = 1; i < 10; i++) {
//        var row = document.createElement("tr");
//        row.id = i;
//        for (var j = 1; j < 6; j++) {
//            var cell = document.createElement("td");
//            cell.id = i + "/" + j;
//            cell.appendChild(document.createTextNode("第" + cell.id + "列"));
//            row.appendChild(cell);
//        }
//        document.getElementById("newbody").appendChild(row);
//    }
//}

function addRow() {
    var length = document.getElementById("mytable").rows.length;
    //alert(length);
    /*document.getElementById("newbody").insertRow(length);
     　　document.getElementById(length+1).setAttribute("id",length+2);*/
    var tr = document.createElement("tr");
    var td = document.createElement("td");
    td.appendChild(document.createTextNode(""));
    tr.appendChild(td);
    tr.id = length + 1;
    var td2 = document.createElement("td");
    var input = document.createElement("input");
    input.type = "text";
    input.setAttribute("class", "s_input");
    input.setAttribute("name", "line_" + length);
    td2.id = tr.id + "/" + 1;
    td2.align = "center";
    td2.appendChild(input);
    tr.appendChild(td2);
    document.getElementById("mytable").appendChild(tr);
}
function showHide() {
    //var btn = document.getElementById('btn');
    var yuansu = document.getElementById('confirmBtn');
    if (yuansu.style.display == "none")
        yuansu.style.display = "block";
    if (yuansu.style.visibility == "hidden")
        yuansu.style.visibility = "visible";
    //} else {
    //    yuansu.style.display = "block";
    //}
}

function addunit() {
    //showHide();
    var length = document.getElementById("mytable").rows.length;

    var tr = document.createElement("tr");
    var td = document.createElement("td");
    td.appendChild(document.createTextNode(""));
    tr.appendChild(td);
    tr.id = length + 1;

    var td2 = document.createElement("td");
    var input = document.createElement("input");
    input.type = "text";
    input.setAttribute("class", "s_input");
    input.setAttribute("name", "unit_code" + length);
    td2.id = tr.id + "/" + 1;
    td2.align = "center";
    td2.appendChild(input);
    tr.appendChild(td2);

    var td4 = document.createElement("td");
    var input2 = document.createElement("input");
    input2.type = "text";
    input2.setAttribute("class", "s_input");
    input2.setAttribute("name", "unit_name" + length);
    td4.id = tr.id + "/" + 1;
    td4.align = "center";
    td4.appendChild(input2);
    tr.appendChild(td4);

    var td3 = document.createElement("td");
    td3.appendChild(document.createTextNode(""));
    var td4 = document.createElement("td");
    td4.appendChild(document.createTextNode(""));
    tr.appendChild(td4);
    document.getElementById("mytable").appendChild(tr);
}

function addRow_withInsert() {
    varrow = document.getElementById("table").insertRow(document.getElementById("table").rows.length);
    var rowCount = document.getElementById("table").rows.length;

    var countCell = document.getElementById("table").rows.item(0).cells.length;
    for (var i = 0; i < countCell; i++) {
        var cell = row.insertCell(i);

        cell.innerHTML = "新" + (rowCount) + "/" + (i + 1) + "列";
        cell.id = (rowCount) + "/" + (i + 1);

    }
}

/*删除行，采用deleteRow(row Index)*/
function removeRow() {
    /* var row=document.getElementById("2");
     　　var index=row.rowIndex;
     　　alert(index);*/
    document.getElementById("newbody").deleteRow(document.getElementById(document.getElementById("table").rows.length).rowIndex);
}

function addCell() {
    /*document.getElementById("table").rows.item(0).cells.length
     用来获得表格的列数
     */
    for (var i = 0; i < document.getElementById("table").rows.length; i++) {
        var cell = document.getElementById("table").rows[i].insertCell(2);
        cell.innerHTML = "第" + (i + 1) + "/" + 3 + "列";

    }
}

/*删除列，采用deleteCell(列位置)的方法*/
function removeCell() {
    for (var i = 0; i < document.getElementById("table").rows.length; i++) {
        document.getElementById("table").rows[i].deleteCell(0);
    }
}

function rebulid() {
    var beginRow = document.getElementById("beginRow").value;
    /*开始行*/
    var endRow = document.getElementById("endRow").value;
    /*结束行*/

    var beginCol = document.getElementById("beginCol").value;
    /*开始列*/
    var endCol = document.getElementById("endCol").value;
    /*结束列*/

    var tempCol = beginRow + "/" + beginCol;
    /*定位要改变属性的列*/
    alert(tempCol);
    var td = document.getElementById(tempCol);

    /*删除要合并的单元格*/
    for (var x = beginRow; x <= endRow; x++) {
        for (var i = beginCol; i <= endCol; i++) {
            if (x == beginRow) {

                document.getElementById("table").rows[x].deleteCell(i + 1);

            }
            else {

                document.getElementById("table").rows[x].deleteCell(i);

            }

        }
    }
    td.rowSpan = (endRow - beginRow) + 1;
}