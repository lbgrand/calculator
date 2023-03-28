function computeValue() {
  let operand1 = document.getElementById("operand1").value;
  let operand2 = document.getElementById("operand2").value;
  let operator = document.getElementById("operator").value;
  let resultField = document.getElementById("result");

  fetch(`api/${operator}/${operand1}/${operand2}`)
  .then((response) => response.json())
  .then((result) => resultField.value = result);
}