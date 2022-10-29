// Call the dataTables jQuery plugin
$(document).ready(function() {
  getUsuarios();
  $('#dataTable').DataTable();
});


async function getUsuarios(){
  const rawResponse = await fetch("usuarios",{
      method : GET,
      headers:{
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
  });
  const Content = await rawResponse.json();
}