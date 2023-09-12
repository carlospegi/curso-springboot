// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios()
  $('#usuarios').DataTable();
});


async function cargarUsuarios() {
let listado = ''
  try {
    const response = await fetch('/usuarios', {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      },
    });

    if (!response.ok) {
      throw new Error('Solicitud fallida');
    }

    const data = await response.json();

for(let usuario of data){

let usuarioHTML =
` <tr>
                                                       <td>${usuario.id}</td>
                                                       <td>${usuario.nombre} ${usuario.apellido}</td>
                                                       <td>${usuario.email}</td>
                                                       <td>${usuario.telefono}</td>
                                                       <td>
                                                           <a href="#" class="btn btn-danger btn-circle btn-sm">
                                                               <i class="fas fa-trash"></i>
                                                           </a>
                                                       </td>

                                                   </tr>`

listado += usuarioHTML

}

  } catch (error) {
   console.log("error");
  }

document.querySelector("#usuarios tbody").outerHTML = listado;
}












