function getRoots(a, b, c) {
    let D = b * b - 4 * a * c;

    if (a == 0) {
        if (b != 0) {
            return [-c / b, null];
        } else {
            return [null, null];
        }
    } else if (D == 0) {
        return [-b / (2 * a), null];
    } else if (D > 0) {
        return [(-b + Math.sqrt(D)) / (2 * a), (-b - Math.sqrt(D)) / (2 * a)];
    } else {
        return [null, null];
    }
}

function getMessage(r1, r2) {
    if (r1 && r2) {
        return "два корня уравнения:  " + r1 + ",  " + r2;
    } else if (r1) {
        return "один корень уравнения: " + r1;
    } else {
        return ", что действительных корней нет";
    }
}

function setRootsTable(r1, r2) {
    let tbody = document.getElementById("hist_table").getElementsByTagName("tbody")[0];

    let row = document.createElement("tr");
    let left = document.createElement("td");
    let right = document.createElement("td");

    row.setAttribute("onclick", "rowDelete(this)");

    tbody.appendChild(row);
    row.appendChild(left);
    row.appendChild(right);

    if (r1 || r2) {
        left.innerHTML  = r1;
        right.innerHTML = r2;
    } else {
        left.innerHTML  = "действительных";
        right.innerHTML = "корней нет";
    }
}

function rowDelete(link) {
    link.remove();
}

cell_button.onclick = function() {
    let a = document.getElementById("cell_1").value;
    let b = document.getElementById("cell_2").value;
    let c = document.getElementById("cell_3").value;

    let [first_root, second_root] = getRoots(a, b, c);
    document.getElementById("get_roots").innerHTML = getMessage(first_root, second_root);
    setRootsTable(first_root, second_root);
}