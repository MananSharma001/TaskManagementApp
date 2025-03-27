function addTask() {
    let title = document.getElementById("taskTitle").value;
    let desc = document.getElementById("taskDesc").value;
    let taskList = document.getElementById("taskList");

    if (title && desc) {
        let li = document.createElement("li");
        li.textContent = `${title}: ${desc}`;
        taskList.appendChild(li);
    }
}
